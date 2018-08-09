package group7.workmanager.main;

import group7.workmanager.graphics.Infor;
import group7.workmanager.graphics.View;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import group7.workmanager.database.ResultUtils;
import group7.workmanager.database.WorkDbControl;
import java.sql.RowId;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class User {

    private String name = "bạn", username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //danh sach cac cong viec da duoc sap xep theo thoi gian bat dau cua user, se duoc doc tren database
    private ArrayList<Work> works = new ArrayList<>();

    //danh sach cac cong viec se duoc hien thi len man hinh voi mot ngay da xac dinh
    private ArrayList<Work> workView = new ArrayList();

    public ArrayList<Work> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Work> works) {
        this.works = works;
    }

    public void setWorkView(ArrayList<Work> workView) {
        this.workView = workView;
    }
    
    public ArrayList<Work> getWorkView() {
        return workView;
    }

    //doc co so du lieu toan bo cong viec cua user
    public void readDataBase() throws SQLException, ParseException {
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
//        ResultUtils.rs.next();
        WorkDbControl.getWork(ResultUtils.rs.getInt("user_id"));
        while(ResultUtils.rs.next()){
            String work_name = ResultUtils.rs.getString("work_name");
            String time_start = ResultUtils.rs.getString("time_start");
            String note = ResultUtils.rs.getString("note");
            int state = ResultUtils.rs.getInt("state");
            // den day database da duoc doc vao cac bien work_name, time_start, note, state
            // ong them no vao cai arrays work ma ong dung hien thi di
//            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
//            Date time = dateFormat.parse(time_start);
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
            Date time = sdf.parse(time_start);
            //SimpleDateFormat print = new SimpleDateFormat("MMM d, yyyy HH:mm:ss");
            Work work;
            work = new Work(work_name, time, state, note);
            works.add(work);
//            System.out.format("%s %s %s %s\n", work_name, time_start, note, state);
            
        }

    }

    //doc workView voi ngay(dd/MM/yyyy) hien thi tren man hinh, nen thuc hien sau phuong thuc nay readDatabase, nhung tuy thoi
    public void readWorkView(Date date) {
        workView.clear();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(View.cal.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        //ngay hien tai tren man hinh la dd/MM/yyyy 00:00
        for (Work i : works) {
            if (i.getTimeStart().compareTo(View.cal.getTime()) > 0 && i.getTimeStart().compareTo(calendar.getTime()) < 0) {
                workView.add(i);
            }
        }
    }

    //ham cat nhat co so du lieu moi khi them, sua, xoa 1 cong viec nao do
    //phai sap xep cong viec theo thoi gian bat dau trong database cho thuan tien
    public void insertDataBase() {

    }
}
