package com.company.chapter08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/20 9:05
 */
public class Example19 extends JFrame {
    private JCheckBox italic;
    private JCheckBox bold;
    private JLabel label;

    public Example19() {
        label = new JLabel("卧室", JLabel.CENTER);
        label.setFont(new Font("楷体", Font.PLAIN, 20));
        this.add(label);
        JPanel panel = new JPanel();
        italic = new JCheckBox("斜体");
        bold = new JCheckBox("加粗");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = 0;
                if (bold.isSelected()) {
                    mode += Font.BOLD;
                }
                if (italic.isSelected()) {
                    mode += Font.ITALIC;
                }
                label.setFont(new Font("楷体", mode, 20));
            }
        };
        italic.addActionListener(listener);
        bold.addActionListener(listener);
        panel.add(italic);
        panel.add(bold);
        this.add(panel, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example19();
    }
}
