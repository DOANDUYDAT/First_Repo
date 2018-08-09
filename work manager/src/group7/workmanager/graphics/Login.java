package group7.workmanager.graphics;

import group7.workmanager.main.Schedule;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import group7.workmanager.database.ResultUtils;
import group7.workmanager.database.UserDbControl;

public class Login extends javax.swing.JPanel {

    private ForgetPass fp = new ForgetPass();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        batBuoc = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        combobox2 = new javax.swing.JComboBox<>();
        forget_pass = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setName("Đăng nhập"); // NOI18N

        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Tài khoản");

        name.setToolTipText("enter your username");
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameMouseExited(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("Mật khẩu");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("!");

        pass.setToolTipText("enter your password");
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passMouseExited(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("!");

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("!");

        batBuoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batBuoc.setText("Bắt buộc");

        login.setBackground(new java.awt.Color(153, 153, 255));
        login.setText("Đăng nhập");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        combobox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietnamese", "English", " " }));
        combobox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox2ActionPerformed(evt);
            }
        });

        forget_pass.setForeground(new java.awt.Color(0, 0, 255));
        forget_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forget_pass.setText("Quên mật khẩu ?");
        forget_pass.setToolTipText("click me");
        forget_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forget_passMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batBuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(forget_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {password, username});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combobox2, login, name, pass});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(password)
                    .addComponent(jLabel5)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(batBuoc)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forget_pass))
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {batBuoc, password, username});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {login, name, pass});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combobox2, forget_pass});

    }// </editor-fold>//GEN-END:initComponents


    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        if (combobox2.getSelectedIndex() == 0) {
            batBuoc.setText("Bắt buộc");
            login.setText("Đăng nhập");
            username.setText("Tài khoản");
            password.setText("Mật khẩu");
            forget_pass.setText("Quên mật khẩu ?");
        } else if (combobox2.getSelectedIndex() == 1) {
            batBuoc.setText("Compulsory");
            login.setText("Login");
            username.setText("Username");
            password.setText("Password");
            forget_pass.setText("Forget password");
        }
    }//GEN-LAST:event_combobox2ActionPerformed


    private void forget_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forget_passMouseClicked
        JFrame frame = new JFrame("Forget password");
        frame.add(fp);
        frame.setSize(300, 170);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_forget_passMouseClicked

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        name.setText("");
    }//GEN-LAST:event_nameMouseClicked

    private void nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseExited
        if (name.getText().equals("")) {
            jLabel4.setText("!");
        } else {
            jLabel4.setText("");
        }
    }//GEN-LAST:event_nameMouseExited

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        pass.setText("");
    }//GEN-LAST:event_passMouseClicked

    private void passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseExited
        if (pass.getPassword().length == 0) {
            jLabel5.setText("!");
        } else {
            jLabel5.setText("");
        }
    }//GEN-LAST:event_passMouseExited

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            UserDbControl.getUser(this.getUsername(), this.getPass());
        } catch (SQLException e){
            System.out.println(e);
        }
        try {
            ResultUtils.rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (ResultUtils.rs.getString("account").equals(this.getUsername())){
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                Infor.frame.getLogin().setText("Đăng xuất");
                Infor.frame.getRegis().setVisible(false);
                
                
                
                Infor.frame.getNameID().setText("Xin chào " + View.user.getName());
                View.addImage(Infor.frame.getAvatar(), "bachkhoa.jpg");
                Infor.frame.getAdd().setEnabled(true);
                Infor.frame.getNext().setEnabled(true);
                Infor.frame.getBack().setEnabled(true);
                Infor.frame.getShow().setEnabled(true);
                View.user.setUsername(name.getText());
                View.user.readDataBase();
                View.user.readWorkView(View.cal.getTime());
                Infor.frame.display();
                Infor.frame.schedule = new Schedule();
                Infor.frame.schedule.start();
                
//                View.display();
                JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
                parent.dispose();
                //JOptionPane.showMessageDialog(null, ResultUtils.rs.getString("user_id"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Sai mật khẩu hoặc tài khoản");
        } catch (ParseException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    public String getUsername() {
        return name.getText();
    }

    public char[] getPass() {
        return pass.getPassword();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batBuoc;
    private javax.swing.JComboBox<String> combobox2;
    private javax.swing.JLabel forget_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
