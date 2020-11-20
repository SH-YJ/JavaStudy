package com.company.chapter08;

import java.awt.*;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/12 16:45
 */
public class Example03 {
    public static void main(String[] args) {
        Frame f = new Frame("边界布局");
        Panel p = new Panel();
        f.setSize(400, 400);
        f.setResizable(false);
        f.setLocation(300, 200);
        f.setLayout(new BorderLayout());
        Button btn1 = new Button("Click1");
        Button btn2 = new Button("Click2");
        Button btn3 = new Button("Click3");
        Button btn4 = new Button("Click4");
        f.add(btn1, BorderLayout.NORTH);
        f.add(btn2, BorderLayout.SOUTH);
        f.add(btn3, BorderLayout.EAST);
        f.add(btn4, BorderLayout.WEST);
        f.setVisible(true);
    }
}
