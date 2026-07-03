import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame {

    JLabel label;
    JTextField textField;
    JButton button;

    public StudentForm() {

        setTitle("Student Form");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);                // Correct
        setLocationRelativeTo(null);

        // Label
        label = new JLabel("Enter Student Name:");
        label.setBounds(30, 30, 150, 25);
        add(label);

        // Text Field
        textField = new JTextField();
        textField.setBounds(180, 30, 150, 25);
        add(textField);

        // Button
        button = new JButton("Submit");
        button.setBounds(150, 80, 100, 30);
        add(button);

        // Button Event
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(null, "Hello , " + name);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}