package group7.workmanager.main;

import java.util.Date;

public class Work {

    private String name;
    private Date timeStart;

    //Trạng thái công việc
    /*
    0.Chưa thực hiệns
    1.Đang thực hiện
    2.Hoàn thành
    3.Bỏ lỡ
     */
    private int state;
    //chú thích của công việc
    private String note = "";

    public Work() {

    }

    public Work(String name, Date timeStart, int state, String note) {
        this.name = name;
        this.timeStart = timeStart;
        this.state = state;
        this.note = note;
    }

    //Các hàm khởi tạo của các thuộc tính
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.equals("") == false) {
            this.name = name;
        }
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        if (timeStart != null) {
            this.timeStart = timeStart;
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        if (state > -1 && state < 4) {
            this.state = state;
        }
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        if (note != null) {
            this.note = note;
        }
    }

}
