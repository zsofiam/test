package test;

import javax.swing.*;
import java.awt.event.*;
public class TestWindow implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        TestWindow gui = new TestWindow();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Gomb?");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        button.setText("Gomb!");
    }
}