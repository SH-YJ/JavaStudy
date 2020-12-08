package com.company.chapter08;

import javax.swing.*;

/**
 * @author SH_YJ
 * @date 2020/11/26 17:17
 */
public class Example24 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        final JLabel label = new JLabel("OK");
        frame.add(label, "North");
        String[] title = {"姓名", "年龄", "性别"};
        String[][] body = {
                {"玛丽","20","女"},
                {"赵薇","30","女"},
                {"黄渤","30","男"}
        };
        JTable table = new JTable(body,title);
        frame.add(table);
        JTextField field = new JTextField(20);
        frame.add(field);
        frame.setVisible(true);

    }
}
