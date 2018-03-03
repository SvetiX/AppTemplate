package ru.cyberforum.reisal78.lib;

import javax.swing.*;
import java.awt.*;

public class Lesson01JFrame extends JFrame implements Lesson01 {

    private final Lesson01JPanel panel;

    public Lesson01JFrame() throws HeadlessException {
        setTitle("Test");

        panel = new Lesson01JPanel();
        setContentPane(panel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void addShare(Shape shape) {
        panel.addShape(shape);
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height);
    }
}
