package com.company.chapter08;

import java.awt.*;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/12 16:59
 */
public class Example04 {
    public static void main(String[] args) {
        Frame f = new Frame("网格布局");
        Panel p = new Panel();
        f.setSize(400, 400);
        f.setResizable(false);
        f.setLocation(300, 200);
        f.setLayout(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            Button btn = new Button("btn" + i);
            f.add(btn);
        }
        f.setVisible(true);
    }
}
