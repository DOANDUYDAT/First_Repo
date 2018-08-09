package lthdt.group7.sub09;

import group7.workmanager.graphics.View;
import group7.workmanager.main.Work;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultListModel;
public class ViewWeek extends javax.swing.JPanel {

    public ViewWeek() {
        initComponents();

        Calendar cal = Calendar.getInstance();

        //=============lay thoi gian ngay dau tuan va cuoi tuan cua tuan nay
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.add(Calendar.DAY_OF_MONTH, -cal1.get(Calendar.DAY_OF_WEEK) + 2);
        cal1.set(Calendar.HOUR, 0);
        cal1.set(Calendar.MINUTE, 0);
        cal1.set(Calendar.SECOND, 0);

        cal2.add(Calendar.DAY_OF_MONTH, -cal1.get(Calendar.DAY_OF_WEEK) + 7);
        cal2.set(Calendar.HOUR, 23);
        cal2.set(Calendar.MINUTE, 59);
        cal2.set(Calendar.SECOND, 59);
        //=================Hien thi cho hai label tren man hinh nay===========================
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");

        label1.setText(s.format(cal1.getTime()));
        label2.setText(s.format(cal2.getTime()));
        //Doc ten cac cong viec vao cac list
        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case 2:
                t2.setForeground(Color.BLUE);
                break;
            case 3:
                t3.setForeground(Color.BLUE);
                break;
            case 4:
                t4.setForeground(Color.BLUE);
                break;
            case 5:
                t5.setForeground(Color.BLUE);
                break;
            case 6:
                t6.setForeground(Color.BLUE);
                break;
            case 7:
                t7.setForeground(Color.BLUE);
                break;
            case 8:
                t8.setForeground(Color.BLUE);
                break;
        }
        list2.setModel(new DefaultListModel());
        list3.setModel(new DefaultListModel());
        list4.setModel(new DefaultListModel());
        list5.setModel(new DefaultListModel());
        list6.setModel(new DefaultListModel());
        list7.setModel(new DefaultListModel());
        list8.setModel(new DefaultListModel());
        Calendar temp = Calendar.getInstance();
        DefaultListModel model;
        for (Work w : View.user.getWorks()) {
            if (w.getTimeStart().compareTo(cal1.getTime()) >= 0 && w.getTimeStart().compareTo(cal2.getTime()) <= 0) {
                temp.setTime(w.getTimeStart());
                switch (temp.get(Calendar.DAY_OF_WEEK)) {
                    case 2:
                        model = (DefaultListModel) list2.getModel();
                        model.addElement(w.getName());
                        list2.setModel(model);
                        break;
                    case 3:
                        model = (DefaultListModel) list3.getModel();
                        model.addElement(w.getName());
                        list3.setModel(model);
                        break;
                    case 4:
                        model = (DefaultListModel) list4.getModel();
                        model.addElement(w.getName());
                        list4.setModel(model);
                        break;
                    case 5:
                        model = (DefaultListModel) list5.getModel();
                        model.addElement(w.getName());
                        list5.setModel(model);
                        break;
                    case 6:
                        model = (DefaultListModel) list6.getModel();
                        model.addElement(w.getName());
                        list6.setModel(model);
                        break;
                    case 7:
                        model = (DefaultListModel) list7.getModel();
                        model.addElement(w.getName());
                        list7.setModel(model);
                        break;
                    case 8:
                        model = (DefaultListModel) list8.getModel();
                        model.addElement(w.getName());
                        list8.setModel(model);
                        break;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list3 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        list4 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        list5 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        list6 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        list7 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        list8 = new javax.swing.JList<>();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        list2.setBackground(new java.awt.Color(153, 153, 255));
        list2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(list2);

        list3.setBackground(new java.awt.Color(153, 153, 255));
        list3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane2.setViewportView(list3);

        list4.setBackground(new java.awt.Color(153, 153, 255));
        list4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        list4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(list4);

        list5.setBackground(new java.awt.Color(153, 153, 255));
        list5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane4.setViewportView(list5);

        list6.setBackground(new java.awt.Color(153, 153, 255));
        list6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane5.setViewportView(list6);

        list7.setBackground(new java.awt.Color(153, 153, 255));
        list7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane6.setViewportView(list7);

        list8.setBackground(new java.awt.Color(153, 153, 255));
        list8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane7.setViewportView(list8);

        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t2.setText("Thứ 2");

        t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t3.setText("Thứ 3");

        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t4.setText("Thứ 4");

        t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t5.setText("Thứ 5");

        t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t6.setText("Thứ 6");

        t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t7.setText("Thứ 7");

        t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t8.setText("Chủ nhật");

        label1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        label2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(t2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(t3)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(t4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(t6)
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(t7)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(t8)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label2)
                .addGap(278, 278, 278))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5, jScrollPane6, jScrollPane7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {t2, t3, t4, t5, t6, t7, t8});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label1, label2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2)
                    .addComponent(t3)
                    .addComponent(t4)
                    .addComponent(t5)
                    .addComponent(t6)
                    .addComponent(t7)
                    .addComponent(t8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5, jScrollPane6, jScrollPane7});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {t2, t3, t4, t5, t6, t7, t8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, label1, label2});

    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JList<String> list2;
    private javax.swing.JList<String> list3;
    private javax.swing.JList<String> list4;
    private javax.swing.JList<String> list5;
    private javax.swing.JList<String> list6;
    private javax.swing.JList<String> list7;
    private javax.swing.JList<String> list8;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    // End of variables declaration//GEN-END:variables

}
