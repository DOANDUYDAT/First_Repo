package group7.workmanager.main;

import group7.workmanager.main.Schedule;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Notification extends Thread {

    @Override
    public void run() {
        JFrame frame = new JFrame();
        JLabel label = new JLabel(" Đã đến giờ thực hiện công việc : " + Schedule.w.getName());
        frame.add(label);

        frame.setSize(230, 80);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout());
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
