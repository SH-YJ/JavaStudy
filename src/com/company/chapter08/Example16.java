package com.company.chapter08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/19 16:40
 */
public class Example16 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 700);
        jFrame.setLayout(new FlowLayout());
        JButton btn1 = new JButton("点击");
        btn1.setSize(200, 200);
        jFrame.add(btn1, "North");
        final JDialog dialog = new JDialog(jFrame, "对话框");
        dialog.setSize(220, 300);
        JLabel l1 = new JLabel("模态对话框");
        JButton btn2 = new JButton("点击");
        dialog.add(l1, "North");
        dialog.add(btn2, "South");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setModal(true);
                dialog.setVisible(true);
            }
        });
        jFrame.setVisible(true);
    }
}
