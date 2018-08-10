/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group7.workmanager.database;

import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author DOAN DUY DAT
 */

public class WorkDbControl {
    
    public WorkDbControl(){
        
    }
    
    public static void getWork(int user_id) throws SQLException{
        String sql = "SELECT work_name, time_start, note, state FROM work_manage where user_id = \'"
                + user_id + "\' order by time_start ASC" + ";";
        ResultUtils.rs = ResultUtils.state.executeQuery(sql);
    }
    
    public static void insertWork(String work_name, Date time_start, int user_id, String note, int state) 
            throws SQLException {
        String sql = "INSERT INTO work_manage VALUES (\'"
                + work_name + "\', \'" + String.valueOf(time_start) + "\', \'" + String.valueOf(user_id) + 
                "\', \'" + note + "\', \'" + String.valueOf(state) + "\');";
        ResultUtils.state.executeUpdate(sql);
    }
    
    public static void updateInf(int user_id, String work_name,
            Date new_time_start, String new_note, int new_state) throws SQLException{
        String sql = "UPDATE work_manage SET time_start = \'" + new_time_start + "\', note = \'" +
                new_note + "\', state = \'" + String.valueOf(new_state)
                + "\' WHERE user_id = \'" + String.valueOf(user_id) + "\' and work_name = \'" + work_name + "\';";
        ResultUtils.state.executeUpdate(sql);
    }
    
    public static void deleteWork(int user_id, String work_name) throws SQLException{
        String sql = "DELETE FROM work_manage WHERE user_id = \'"
                + String.valueOf(user_id) + "\' and work_name = \'" + work_name +"\';";
        ResultUtils.state.executeUpdate(sql);
    }
}
