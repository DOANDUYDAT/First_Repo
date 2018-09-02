package group7.workmanager.graphics;

import group7.workmanager.main.Schedule;
import group7.workmanager.main.Work;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import group7.workmanager.database.ResultUtils;
import group7.workmanager.database.WorkDbControl;

public class Infor extends javax.swing.JPanel {

    public static View frame = null;

    public JTextField name() {
        return name;
    }

    public JTextField time() {
        return timeStart;
    }

    public JComboBox state() {
        return state;
    }

    public JTextArea note() {
        return note;
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getSave() {
        return save;
    }

    public Infor() {
        initComponents();
    }

    public JLabel getLabel1() {
        return label1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeStart = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        name = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Thông tin công việc");

        jLabel2.setText("Tên công việc");

        jLabel3.setText("Thời gian bắt đầu");

        timeStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeStart.setText("HH:mm");
        timeStart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                timeStartMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                timeStartMouseMoved(evt);
            }
        });
        timeStart.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                timeStartMouseWheelMoved(evt);
            }
        });
        timeStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeStartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timeStartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timeStartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                timeStartMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                timeStartMouseReleased(evt);
            }
        });

        jLabel5.setText("Trạng thái");

        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa thực hiện", "Đang thực hiện", "Hoàn thành", "Chưa hoàn thành", " " }));
        state.setEnabled(false);
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        jLabel6.setText("Chú thích");

        note.setColumns(20);
        note.setLineWrap(true);
        note.setRows(5);
        note.setTabSize(4);
        jScrollPane1.setViewportView(note);

        add.setText("add");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        save.setText("save");
        save.setEnabled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 0, 51));
        label1.setText("x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(timeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add, save});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(timeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(add))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, name});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {label1, timeStart});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add, save});

    }// </editor-fold>//GEN-END:initComponents

    //các phương thức get các thuộc tính nhập vào
    public String getNameOfWork() {
        return name.getText();
    }

    //Phương thức lấy hh:mm của thời gian bắt đầu
    public Date dateStart(JTextField tf) {
        String num[] = tf.getText().split(":");
        Calendar calendar = Calendar.getInstance();

        calendar.set(View.cal.get(Calendar.YEAR), View.cal.get(Calendar.MONTH),
                View.cal.get(Calendar.DAY_OF_MONTH), Integer.parseInt(num[0]), Integer.parseInt(num[1]));

        return calendar.getTime();

    }

    public Date getTimeStart() {
        return dateStart(timeStart);
    }

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed

    }//GEN-LAST:event_stateActionPerformed

    private void timeStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStartMouseExited
        check(label1, timeStart, "\\d{2}:\\d{2}");
    }//GEN-LAST:event_timeStartMouseExited

    //hàm kiểm tra tính chính xác của định dạng thời gian nhập vào
    public void check(JLabel label, JTextField tf, String pattern) {
        if (tf.getText().matches(pattern) == false) {
            label.setText("x");
        } else {
            String num[] = tf.getText().split(":");
            if (Integer.parseInt(num[0]) > 23 || Integer.parseInt(num[1]) > 59) {
                label.setText("x");
            } else {
                label.setText("");
            }
        }

        if (label1.getText().equals("x") && add.getText().equals("add")) {
            add.setEnabled(false);
        } else {
            add.setEnabled(true);
        }
    }

    private void timeStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStartMouseEntered

    }//GEN-LAST:event_timeStartMouseEntered

    private void timeStartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStartMousePressed

    }//GEN-LAST:event_timeStartMousePressed

    private void timeStartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStartMouseReleased

    }//GEN-LAST:event_timeStartMouseReleased

    private void timeStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStartMouseClicked

    }//GEN-LAST:event_timeStartMouseClicked

    private void timeStartMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_timeStartMouseWheelMoved

    }//GEN-LAST:event_timeStartMouseWheelMoved

    private void timeStartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStartMouseMoved

    }//GEN-LAST:event_timeStartMouseMoved

    private void timeStartMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeStartMouseDragged

    }//GEN-LAST:event_timeStartMouseDragged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        Date start = getTimeStart();
        if (label1.getText().equals("x") || name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Thay đổi thông tin KHÔNG thành công");
            return;
        }
//        else if (start.compareTo(new Date()) < 0) {
//                JOptionPane.showMessageDialog(null, "Thời gian không hợp lý");
//        }
//        Date start = getTimeStart();
//            if (start.compareTo(new Date()) < 0) {
//                JOptionPane.showMessageDialog(null, "Thời gian không hợp lý");
        else{   
        frame.user.getWorkView().get(frame.getList1().getSelectedIndex()).setName(name.getText());
        frame.user.getWorkView().get(frame.getList1().getSelectedIndex()).setTimeStart(dateStart(timeStart));
        frame.user.getWorkView().get(frame.getList1().getSelectedIndex()).setState(state.getSelectedIndex());
        frame.user.getWorkView().get(frame.getList1().getSelectedIndex()).setNote(note.getText());
        Collections.sort(frame.user.getWorkView(), (Work o1, Work o2) -> o1.getTimeStart().compareTo(o2.getTimeStart()));
        Collections.sort(frame.user.getWorks(), (Work o1, Work o2) -> o1.getTimeStart().compareTo(o2.getTimeStart()));

        frame.display();
        //update database
        String sql = "select user_id from account_manage where account = \'"
                + View.user.getUsername() + "\';";
        try {
            ResultUtils.rs = ResultUtils.state.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ResultUtils.rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Date start = getTimeStart();
        Work w = new Work(name.getText(), start, state.getSelectedIndex(), note.getText());
        try {
            WorkDbControl.updateInf(ResultUtils.rs.getInt("user_id"), w.getName(), start, w.getNote(), w.getState());
        } catch (SQLException ex) {
            Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            View.user.readDataBase();
//        } catch (SQLException ex) {
//            Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ParseException ex) {
//            Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
//        }
        JOptionPane.showMessageDialog(null, "Thay đổi thành công");
        View.frame.setVisible(false);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (add.getText().equals("add")) {
            Date start = getTimeStart();
            if (start.compareTo(new Date()) < 0) {
                JOptionPane.showMessageDialog(null, "Thời gian không hợp lý");
            } else if (name.getText() == null || name.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Tên công việc chưa được xác nhận");
            } else {
                Work w = new Work(name.getText(), start, state.getSelectedIndex(), note.getText());
                //them vao cong viec
                frame.user.getWorkView().add(w);
                frame.user.getWorks().add(w);
                //sap xep lai cong viec hien thi
                Collections.sort(frame.user.getWorkView(), (Work o1, Work o2) -> o1.getTimeStart().compareTo(o2.getTimeStart()));
                Collections.sort(frame.user.getWorks(), (Work o1, Work o2) -> o1.getTimeStart().compareTo(o2.getTimeStart()));
                //hien thi
                frame.display();

                //ngat luong bao thuc cu
                Infor.frame.schedule.clear();
                Infor.frame.schedule.interrupt();

                //chay luonh moi
                Infor.frame.schedule = new Schedule();
                Infor.frame.schedule.start();

                //them vao cong viec nguoi dung vao database
//                System.out.println(View.user.getId());
                String sql = "select user_id from account_manage where account = \'" + View.user.getUsername() + "\';";
                try {
                    ResultUtils.rs = ResultUtils.state.executeQuery(sql);
                } catch (SQLException ex) {
                    Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    ResultUtils.rs.first();
                } catch (SQLException ex) {
                    Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    WorkDbControl.insertWork(w.getName(), w.getTimeStart(), ResultUtils.rs.getInt("user_id"), w.getNote(), w.getState());
                } catch (SQLException ex) {
                    Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
                }

                //====================================================
                name.setText("");
                timeStart.setText("");
                note.setText("");
                label1.setText("x");
                add.setEnabled(false);
                //thông báo thành công
                JOptionPane.showMessageDialog(null, "Thành công");

            }
        } else if (add.getText().equals("delete")) {

            //xoa cong viec khoi man hinh hien thi
            Work w = frame.user.getWorkView().get(frame.getList1().getSelectedIndex());
            frame.user.getWorkView().remove(w);
            //xoa cong viec khoi danh sach cong viec cua nguoi dung
            frame.user.getWorks().remove(w);
            //hien thi va cat nhat database
            frame.display(); // hien thi
            String sql = "select user_id from account_manage where account = \'" + View.user.getUsername() + "\';";
            try {
                ResultUtils.rs = ResultUtils.state.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ResultUtils.rs.first();
            } catch (SQLException ex) {
                Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                WorkDbControl.deleteWork(ResultUtils.rs.getInt("user_id"), w.getName());
            } catch (SQLException ex) {
                Logger.getLogger(Infor.class.getName()).log(Level.SEVERE, null, ex);
            }

            View.frame.setVisible(false);
        }

    }//GEN-LAST:event_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea note;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JTextField timeStart;
    // End of variables declaration//GEN-END:variables

}
