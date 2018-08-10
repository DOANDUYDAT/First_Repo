package group7.workmanager.graphics;

import group7.workmanager.main.Schedule;
import group7.workmanager.main.Work;
import group7.workmanager.main.User;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class View extends javax.swing.JFrame {

    public static User user = new User();
    private static View instance;
    public static boolean sucessfulLogin = true;

    public static Schedule schedule;

    public static Calendar cal;

    //Frame chua cac thanh phan Infor, Login, set, re
    public static JFrame frame = new JFrame();
    private Infor inFor = new Infor();
    private Login lg = new Login();
    private Setting set = new Setting();
    private Register re = new Register();
    
    public View() {
        initComponents();
        list1.setModel(new DefaultListModel());
        list2.setModel(new DefaultListModel());
        list3.setModel(new DefaultListModel());
        list4.setModel(new DefaultListModel());
        inFor.frame = this;

     

        addImage(add, "images//cong.png");
        addImage(today, "images//clock.png");
        addImage(avatar, "images//avatar.jpg");
        setTitle("Work Manage");
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public static View getInstance() {
        if (instance == null) {
            instance = new View();
        }
        return instance;
    }

    public JLabel getLogin() {
        return login;
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getBack() {
        return back;
    }

    public JButton getNext() {
        return next;
    }

    public JButton getShow() {
        return show;
    }

    public JLabel getRegis() {
        return regis;
    }

    public JLabel getNameID() {
        return nameID;
    }

    public JLabel getAvatar() {
        return avatar;
    }

    public JButton getShowWeek() {
        return showWeek;
    }

    public JLabel getDate() {
        return date;
    }
    
    //ham hien thi ten cac cong viec ra cac list voi cac workView cua user
    public void display() {
        DefaultListModel l1 = new DefaultListModel();
        DefaultListModel l2 = new DefaultListModel();
        DefaultListModel l3 = new DefaultListModel();
        DefaultListModel l4 = new DefaultListModel();

        for (Work w : user.getWorkView()) {
            l1.addElement(w.getName());
            switch (w.getState()) {
                case 1:
                    l2.addElement(w.getName());
                    break;
                case 2:
                    l3.addElement(w.getName());
                    break;
                case 0:
                    l4.addElement(w.getName() + " " + w.getTimeStart().getHours() + ":" + w.getTimeStart().getMinutes());
                    break;
                default:
                    break;
            }
        }
        list1.setModel(l1);
        list2.setModel(l2);
        list3.setModel(l3);
        list4.setModel(l4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list3 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list4 = new javax.swing.JList<>();
        nameID = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        today = new javax.swing.JButton();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        regis = new javax.swing.JLabel();
        showWeek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        list1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        list1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(list1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        list2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        list2.setForeground(new java.awt.Color(0, 0, 255));
        jScrollPane3.setViewportView(list2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        list3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        list3.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane4.setViewportView(list3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Công Việc");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("Đang Làm");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("Đã Xong");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Quản Lý Công Việc");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel7.setText("Lời nhắc");

        jScrollPane1.setViewportView(list4);

        nameID.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        nameID.setForeground(new java.awt.Color(255, 0, 0));
        nameID.setText("Bạn chưa đăng nhập");

        add.setToolTipText("Thêm công việc hôm nay");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayActionPerformed(evt);
            }
        });

        back.setText("<");
        back.setEnabled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setText(">");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        date.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back, next});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, today});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, today});

        login.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 204));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Đăng nhập");
        login.setToolTipText("Nhấn vào đây để đăng nhâp");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        setting.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        setting.setForeground(new java.awt.Color(0, 0, 204));
        setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setting.setText("Cài đặt");
        setting.setToolTipText("Nhấn vào đây để cài đăt âm thanh");
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
        });

        show.setForeground(new java.awt.Color(51, 51, 255));
        show.setText("show");
        show.setToolTipText("Nhấn vào đây để sửa, xóa");
        show.setEnabled(false);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        regis.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        regis.setForeground(new java.awt.Color(0, 0, 204));
        regis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regis.setText("Đăng kí");
        regis.setToolTipText("Nhấn vào đây để đăng kí tài khoản");
        regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisMouseClicked(evt);
            }
        });

        showWeek.setForeground(new java.awt.Color(51, 51, 255));
        showWeek.setText("show week");
        showWeek.setEnabled(false);
        showWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showWeekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel1)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showWeek)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {login, regis});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show)
                    .addComponent(showWeek)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {login, regis, setting});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {show, showWeek});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JList<String> getList1() {
        return list1;
    }


    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        displayInfor(set, 300, 300);
    }//GEN-LAST:event_settingMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if (login.getText().equals("Đăng nhập")) {
            displayInfor(lg, 300, 250);
        } else {
            int select = JOptionPane.showConfirmDialog(null, "Bạn muốn đăng xuất");
            if (select == JOptionPane.YES_OPTION) {
                regis.setVisible(true);
                login.setText("Đăng nhập");
                list1.setModel(new DefaultListModel());
                list2.setModel(new DefaultListModel());
                list3.setModel(new DefaultListModel());
                list4.setModel(new DefaultListModel());
                add.setEnabled(false);
                show.setEnabled(false);
                next.setEnabled(false);
                back.setEnabled(false);
                showWeek.setEnabled(false);

                Infor.frame.schedule.clear();
                Infor.frame.schedule.interrupt();

                addImage(avatar, "avatar.jpg");
                nameID.setText("Bạn chưa đăng nhập");
                user.getWorks().clear();
                user.getWorkView().clear();
            }
        }
    }//GEN-LAST:event_loginMouseClicked

    public void displayInfor(Object i, int width, int height) {
        frame = new JFrame();
        if (i instanceof Infor) {
            frame.add((Infor) i);
            frame.setTitle("information");
        } else if (i instanceof Login) {
            frame.add((Login) i);
            frame.setTitle("Login");
        } else if (i instanceof Setting) {
            frame.add((Setting) i);
            frame.setTitle("Audio");
        } else if (i instanceof Register) {
            frame.add((Register) i);
            frame.setTitle("Register");
        } else if (i instanceof ViewWeek) {
            frame.add((ViewWeek) i);
            frame.setTitle("Lịch của tuần này");
        }

        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        displayInfor(inFor, 280, 430);
    }//GEN-LAST:event_addActionPerformed

    private void todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayActionPerformed
        cal.setTime(new Date());
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        user.readWorkView(cal.getTime());
        date.setText("" + cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR));
        display();
    }//GEN-LAST:event_todayActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
//        if (user.getWorks().isEmpty()) {
//            if (cal.getTime().compareTo(new Date()) >= 0) {
//                back.setEnabled(true);
//                cal.add(Calendar.DAY_OF_MONTH, -1);
//                date.setText("" + cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR));
//            } else {
//                back.setEnabled(false);
//            }
//        } else if (cal.getTime().compareTo(user.getWorks().get(0).getTimeStart()) <= 0) {
//            back.setEnabled(false);
//        } else {
//            cal.add(Calendar.DAY_OF_MONTH, -1);
//            date.setText("" + cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR));
//            user.readWorkView(cal.getTime());
//            display();
//        }
        cal.add(Calendar.DAY_OF_MONTH, -1);
        date.setText("" + cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR));
        if (user.getWorks().isEmpty() || equals(cal.getTime(), user.getWorks().get(user.getWorks().size() - 1).getTimeStart())) {
            user.getWorkView().clear();
            list1.setModel(new DefaultListModel());
            list2.setModel(new DefaultListModel());
            list3.setModel(new DefaultListModel());
            list4.setModel(new DefaultListModel());
        }
        user.readWorkView(cal.getTime());
        display();
    }//GEN-LAST:event_backActionPerformed

    public boolean equals(Date d1, Date d2) {
        return d1.getDay() == d2.getDay() && d1.getMonth() == d1.getMonth() && d1.getYear() == d2.getYear();
    }

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        cal.add(Calendar.DAY_OF_MONTH, 1);
        date.setText("" + cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR));
        if (user.getWorks().isEmpty() || equals(cal.getTime(), user.getWorks().get(user.getWorks().size() - 1).getTimeStart())) {
            user.getWorkView().clear();
            list1.setModel(new DefaultListModel());
            list2.setModel(new DefaultListModel());
            list3.setModel(new DefaultListModel());
            list4.setModel(new DefaultListModel());
        }
        user.readWorkView(cal.getTime());
        display();
    }//GEN-LAST:event_nextActionPerformed

    private void list1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list1ValueChanged

    }//GEN-LAST:event_list1ValueChanged

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if (list1.getSelectedValue() != null) {
            Infor i = new Infor();
            i.getLabel1().setText("");
            i.state().setEnabled(true);
            i.getAdd().setText("delete");
            i.getAdd().setEnabled(true);
            i.getSave().setEnabled(true);
            i.name().setEnabled(false);
            i.name().setText(user.getWorkView().get(list1.getSelectedIndex()).getName());
            i.note().setText(user.getWorkView().get(list1.getSelectedIndex()).getNote());
            i.state().setSelectedIndex(user.getWorkView().get(list1.getSelectedIndex()).getState());
            Date date = user.getWorkView().get(list1.getSelectedIndex()).getTimeStart();
            SimpleDateFormat s = new SimpleDateFormat("HH:mm");
            i.time().setText(s.format(date));
            displayInfor(i, 280, 430);
        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa lựa chọn trên danh sách Công Việc");
        }
    }//GEN-LAST:event_showActionPerformed

    private void regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisMouseClicked
        displayInfor(re, 300, 330);
    }//GEN-LAST:event_regisMouseClicked

    private void showWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showWeekActionPerformed
        ViewWeek w = new ViewWeek();
        displayInfor(w, 750, 250);
    }//GEN-LAST:event_showWeekActionPerformed

    public static void addImage(Object b, String file) {
        try {
            BufferedImage image = ImageIO.read(new File(file));

            int ix = image.getWidth();
            int iy = image.getHeight();

            int x = 0, y = 0, dx = 0, dy = 0;
            if (b instanceof JButton) {
                x = ((JButton) b).getSize().width;
                y = ((JButton) b).getSize().height;
                if (x / y > ix / iy) {
                    dy = y;
                    dx = dy + ix / iy;
                } else {
                    dx = x;
                    dy = dx + iy / ix;
                }
                ((JButton) b).setIcon(new ImageIcon(image.getScaledInstance(dx, dy, 0)));
            } else if (b instanceof JLabel) {
                x = ((JLabel) b).getSize().width;
                y = ((JLabel) b).getSize().height;
                if (x / y > ix / iy) {
                    dy = y;
                    dx = dy + ix / iy;
                } else {
                    dx = x;
                    dy = dx + iy / ix;
                }
                ((JLabel) b).setIcon(new ImageIcon(image.getScaledInstance(dx, dy, 0)));
            }
        } catch (IOException ex) {

        }
    }

//    public static void main(String args[]) throws SQLException, ClassNotFoundException {
//        ResultUtils.resultUtils();
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
////        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View().setVisible(true);
//            }
//        });
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel avatar;
    private javax.swing.JButton back;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> list1;
    private javax.swing.JList<String> list2;
    private javax.swing.JList<String> list3;
    private javax.swing.JList<String> list4;
    private javax.swing.JLabel login;
    private javax.swing.JLabel nameID;
    private javax.swing.JButton next;
    private javax.swing.JLabel regis;
    private javax.swing.JLabel setting;
    private javax.swing.JButton show;
    private javax.swing.JButton showWeek;
    private javax.swing.JButton today;
    // End of variables declaration//GEN-END:variables
}
