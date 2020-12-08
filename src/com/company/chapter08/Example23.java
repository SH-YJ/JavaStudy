package com.company.chapter08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/26 16:21
 */
public class Example23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        JLabel label = new JLabel("OK");
        frame.add(label, "North");
        JPopupMenu menu = new JPopupMenu();
        JMenuItem file = new JMenuItem("文件");
        JMenuItem edit = new JMenuItem("编辑");
        JMenuItem exit = new JMenuItem("退出");
        menu.add(file);
        menu.add(edit);
        menu.addSeparator();
        menu.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    menu.show(e.getComponent(), e.getX(), e.getY());
                }
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
        frame.setVisible(true);
    }
}
