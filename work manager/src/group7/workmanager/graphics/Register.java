package group7.workmanager.graphics;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import group7.workmanager.database.ResultUtils;
import group7.workmanager.database.UserDbControl;

public class Register extends javax.swing.JPanel {

    public Register() {
        initComponents();
    }

    //cac phuong thuc tra la thong tin nhap tren man hinh
    //tra lai ten nguoi dung
    public String getNameText() {
        return name.getText();
    }

    //tra lai tai khoan
    public String getNameID() {
        return id.getText();
    }

    //tra lai mat khau
    public char[] getPass() {
        return pass.getPassword();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nameText = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        idText = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        passText = new javax.swing.JLabel();
        pass2Text = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        accept = new javax.swing.JCheckBox();
        send = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        nameText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameText.setText("Tên tài khoản");

        idText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idText.setText("Tài khoản");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        passText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passText.setText("Mật khẩu");

        pass2Text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass2Text.setText("Nhập lại mật khẩu");

        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passMouseExited(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pass2MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đăng Kí Tài Khoản");

        jLabel6.setText("Giới tính");

        nam.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(nam);
        nam.setText("nam");

        nu.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(nu);
        nu.setText("nữ");

        accept.setBackground(new java.awt.Color(255, 204, 204));
        accept.setText("Tôi đồng ý");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        send.setBackground(new java.awt.Color(153, 153, 255));
        send.setText("Gửi");
        send.setBorder(null);
        send.setEnabled(false);
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        label.setForeground(new java.awt.Color(255, 0, 0));
        label.setText("x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText)
                            .addComponent(idText)
                            .addComponent(passText)
                            .addComponent(pass2Text)
                            .addComponent(accept))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(nam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idText, nameText, pass2Text, passText});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {id, name, pass, pass2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nam, nu});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {accept, send});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passText)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass2Text)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(nam)
                    .addComponent(nu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accept)
                    .addComponent(send))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {id, idText, jLabel6, label, name, nameText, pass, pass2, pass2Text, passText});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nam, nu});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {accept, send});

    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed

    }//GEN-LAST:event_idActionPerformed

    private void pass2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2MouseExited
        if (pass.getPassword().length > 0 && Arrays.equals(pass2.getPassword(), pass.getPassword())) {
            label.setText("");

        } else {
            label.setText("x");
        }
    }//GEN-LAST:event_pass2MouseExited

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed

    }//GEN-LAST:event_passActionPerformed

    private void passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseExited
        if (pass2.getPassword().length > 0 && Arrays.equals(pass2.getPassword(), pass.getPassword())) {
            label.setText("");

        } else {
            label.setText("x");
        }
    }//GEN-LAST:event_passMouseExited

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        if (accept.isSelected()) {
            send.setEnabled(true);
        } else {
            send.setEnabled(false);
        }
    }//GEN-LAST:event_acceptActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        if (name.getText().equals("") || id.getText().equals("") || (nam.isSelected() == false && nu.isSelected() == false)) {
            JOptionPane.showMessageDialog(null, "Bạn chưa hoàn thành đầy đủ thông tin");
        } else if (label.getText().equals("x")) {
            JOptionPane.showMessageDialog(null, "Vui lòng xác minh lại mật khẩu");
        } else {
            //do something
            
            try {
            UserDbControl.getUser(this.getNameID(), this.getPass());
            } catch (SQLException e){
                System.out.println(e);
            }
            try {
                ResultUtils.rs.first();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if(ResultUtils.rs.getString("account").equals(this.getNameID())){
                    JOptionPane.showMessageDialog(null, "Tài khoản đã có người sử dụng");
                }
            } catch (SQLException ex) {
                try {
                    UserDbControl.insertUser(this.getNameID(), this.getPass(), this.getNameText());
                } catch (SQLException ex1) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex1);
                }
                
                    JOptionPane.showMessageDialog(null, "Đăng kí thành công");
                    View.frame.setVisible(false);
                //Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_sendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox accept;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField id;
    private javax.swing.JLabel idText;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label;
    private javax.swing.JRadioButton nam;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameText;
    private javax.swing.JRadioButton nu;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JLabel pass2Text;
    private javax.swing.JLabel passText;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
