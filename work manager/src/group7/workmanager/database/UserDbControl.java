/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group7.workmanager.database;

import java.sql.SQLException;

/**
 *
 * @author DOAN DUY DAT
 */
public class UserDbControl {
    
    public UserDbControl(){
        
    }
    
    
    public static void getUser(String account, char[] password) throws SQLException{
        String sql = "select * from account_manage where account = \'" + account + 
                "\' and pass = \'" + String.valueOf(password) + "\';";
        ResultUtils.rs = ResultUtils.state.executeQuery(sql);
    }
            
    public static void insertUser(String account, char[] password, String user_name)
            throws SQLException{
        String sql = "insert into account_manage values (null,\'" + account +
                "\', \'" + String.valueOf(password) + "\', \'" + user_name + "\');";
        ResultUtils.state.executeUpdate(sql);
    }
    
    public void updatePass (int user_id, char[] new_password) 
            throws SQLException{
        String sql = "UPDATE account_manage SET password = \'" + String.valueOf(new_password)
                + "\' WHERE user_id = \'" + String.valueOf(user_id) + "\';";  
        ResultUtils.state.executeUpdate(sql);
    }
    
    public void deleteUser(String user_id) throws SQLException{
        String sql = "DELETE FROM account_manage WHERE user_id = \'" + 
                String.valueOf(user_id) + "\';";
        ResultUtils.state.executeUpdate(sql);
    }
}
