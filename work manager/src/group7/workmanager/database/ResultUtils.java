/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group7.workmanager.database;

/**
 *
 * @author DOAN DUY DAT
 */
import group7.workmanager.main.ConnectionUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultUtils {
    public static Connection conn;
    public static Statement state;
    public static ResultSet rs;
    
    public ResultUtils(){
        
    }
    
    public static void resultUtils() throws SQLException, ClassNotFoundException{
        System.out.println ("Get connection ... ");
        conn = ConnectionUtils.getMyConnection();
        System.out.println("Get connection " + conn);
        System.out.println("Done!");
        // Tạo đối tượng Statement.
        state = conn.createStatement();
    }
}
