package com.company.chapter08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/19 16:15
 */
public class Example15 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JFrameTest");
        JButton btn = new JButton("点击");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p();
            }
        });
        jFrame.setSize(200, 200);
        jFrame.add(btn, "North");
        jFrame.setVisible(true);
    }

    public static void p() {
        System.out.println("点击");
    }
}
