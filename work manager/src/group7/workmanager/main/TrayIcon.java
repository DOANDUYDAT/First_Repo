/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group7.workmanager.main;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import group7.workmanager.main.Schedule;
import group7.workmanager.graphics.Infor;
import group7.workmanager.graphics.View;
import group7.workmanager.graphics.View;

/**
 *
 * @author DOAN DUY DAT
 */
public class TrayIcon {
    static boolean isImage1 = true;
    public TrayIcon(){
        
    }
    public static void trayIcon() throws AWTException, IOException{
        if (!SystemTray.isSupported()) {
            System.out.println("System is not supported");
            return;
        }
        // get the SystemTray instance
        SystemTray tray = SystemTray.getSystemTray();

        // load an image
        File f1 = new File("images/notifications.png");
        File f2 = new File("images/not-notifications.png");
        
        Image image1 = ImageIO.read(f1);
        Image image2 = ImageIO.read(f2);
        
        
        // create a TrayIcon
        java.awt.TrayIcon trayIcon = new java.awt.TrayIcon(image1);
        trayIcon.setImageAutoSize(true);
        
        // create a tooltip
        String tooltip = "Click to change mode";
        trayIcon.setToolTip(tooltip);
        
        // create a popup menu
        PopupMenu popup = new PopupMenu();

        // create a popup menu components
        MenuItem open = new MenuItem("Open");
        MenuItem exit = new MenuItem("Exit");

        // add components to popup menu
        popup.add(open);
        popup.add(exit);
        trayIcon.setPopupMenu(popup);
        
        ActionListener toOpen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                View mainWindow = View.getInstance();
                mainWindow.setVisible(true);
                mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        };
        
        open.addActionListener(toOpen);
        
        ActionListener toExit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        };
        exit.addActionListener(toExit);
        // add Tray Icon to SystemTray
        tray.add(trayIcon);
        
        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 1) {
                    if (isImage1 == true){
                        trayIcon.setImage(image2);
                        View.schedule.clear();
                        View.schedule.interrupt();
                                
                        isImage1 = false;
                    }
                    else{
                        trayIcon.setImage(image1);
                        View.schedule = new Schedule();
                        View.schedule.start();
                        isImage1 = true;
                    }       
                } 
                else{
                    View mainWindow = View.getInstance();
                    mainWindow.setVisible(true);
                    mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
         trayIcon.addMouseListener(listener);
        
    }
}
