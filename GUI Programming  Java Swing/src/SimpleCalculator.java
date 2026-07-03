import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First Number
        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(30, 30, 100, 30);

        JTextField txt1 = new JTextField();
        txt1.setBounds(140, 30, 150, 30);

        // Second Number
        JLabel label2 = new JLabel("Second Number:");
        label2.setBounds(30, 80, 100, 30);

        JTextField txt2 = new JTextField();
        txt2.setBounds(140, 80, 150, 30);

        // Result Label
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 220, 250, 30);

        // Buttons
        JButton addBtn = new JButton("+");
        addBtn.setBounds(30, 140, 60, 30);

        JButton subBtn = new JButton("-");
        subBtn.setBounds(100, 140, 60, 30);

        JButton mulBtn = new JButton("*");
        mulBtn.setBounds(170, 140, 60, 30);

        JButton divBtn = new JButton("/");
        divBtn.setBounds(240, 140, 60, 30);

        // Addition
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt1.getText());
                int num2 = Integer.parseInt(txt2.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            }
        });

        // Subtraction
        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt1.getText());
                int num2 = Integer.parseInt(txt2.getText());
                resultLabel.setText("Result: " + (num1 - num2));
            }
        });

        // Multiplication
        mulBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt1.getText());
                int num2 = Integer.parseInt(txt2.getText());
                resultLabel.setText("Result: " + (num1 * num2));
            }
        });

        // Division
        divBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(txt1.getText());
                int num2 = Integer.parseInt(txt2.getText());

                if (num2 == 0) {
                    resultLabel.setText("Cannot divide by zero");
                } else {
                    resultLabel.setText("Result: " + (num1 / num2));
                }
            }
        });

        frame.add(label1);
        frame.add(txt1);
        frame.add(label2);
        frame.add(txt2);

        frame.add(addBtn);
        frame.add(subBtn);
        frame.add(mulBtn);
        frame.add(divBtn);

        frame.add(resultLabel);

        frame.setVisible(true);
    }
}