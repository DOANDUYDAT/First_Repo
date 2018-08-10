package group7.workmanager.main;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import group7.workmanager.graphics.View;
import group7.workmanager.database.MySQLConnUtils;
import group7.workmanager.database.ResultUtils;

public class ConnectionUtils {

    public static Connection getMyConnection() throws SQLException,
            ClassNotFoundException {
        // Sử dụng MySQL
        // Bạn có thể thay thế bởi Database nào đó.
        return MySQLConnUtils.getMySQLConnection();
    }

    //
    // Test Connection ...
    //
    public static void main(String[] args) throws IOException, AWTException,
            SQLException, ClassNotFoundException {

        // ket noi database
        ResultUtils.resultUtils();

        View mainWindow = View.getInstance();
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        TrayIcon.trayIcon();

    }

}
