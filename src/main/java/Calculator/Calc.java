package Calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by DeBasser on 28.05.2017.
 */
public class Calc {
    public static void main(String[] args) {
        JPanel panel1 = new JPanel();
        FlowLayout fl = new FlowLayout();
        panel1.setLayout(fl);
        JLabel label1 = new JLabel("Number1: ");
        JTextField tf1 = new JTextField(10);


        JFrame flame1 = new JFrame("My first app");

        panel1.add(label1);
        panel1.add(tf1);

        JFrame frame1 = new JFrame("My program");
        frame1.setContentPane(panel1);
        frame1.setSize(400, 100);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
