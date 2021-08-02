package com.template.game;

import java.awt.BorderLayout;
import javax.swing.JFrame;
public class TestTemplate {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Design Pattern Template" );
        Canvas canvas = new Canvas();
        frame.add(canvas, BorderLayout.CENTER );
        frame.setSize(300, 350);
        canvas.setFocusable(true );
        frame.setVisible(true );
        canvas.requestFocus();
    }
}
