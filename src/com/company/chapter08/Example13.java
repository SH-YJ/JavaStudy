package com.company.chapter08;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/16 8:28
 */
public class Example13 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(300, 500);
        TextField t = new TextField();
        t.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                System.out.println("你按下了键盘" + keycode);
                if (keycode == 10) {
                    System.exit(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        f.add(t, "North");
        f.setVisible(true);
    }
}
