package com.company.chapter08;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/12 16:12
 */
public class Example01 {
    public static void main(String[] args) {
        Frame f = new Frame("流式布局");
        f.setSize(400, 400);
        f.setResizable(false);
        f.setLocation(300, 200);
        f.setLayout(new FlowLayout());
        Button btn = new Button("Click");
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("ss");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });
        f.add(btn);
        f.setVisible(true);
    }
}
