package com.company.chapter08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/23 8:15
 */
public class Example21 extends JFrame {
    private final JComboBox<String> comboBox;
    private JTextField field;

    public Example21() {
        JPanel panel = new JPanel();
        comboBox = new JComboBox<String>();
        comboBox.addItem("请选择城市：");
        comboBox.addItem("北京");
        comboBox.addItem("天津");
        comboBox.addItem("南京");
        comboBox.addItem("上海");
        comboBox.addItem("重庆");
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cityname = comboBox.getSelectedItem().toString();
                if ("请选择城市：".equals(cityname)){
                    field.setText("");
                }
                else {
                    field.setText("城市名：" + cityname);
                }
            }
        });
        field = new JTextField(20);
        field.setEnabled(false);
        panel.add(comboBox);
        panel.add(field);
        this.add(panel, BorderLayout.NORTH);
        this.setSize(450, 100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example21();
    }
}
