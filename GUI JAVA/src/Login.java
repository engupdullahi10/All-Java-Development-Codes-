// Login.java
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    private JTextField nameField, idField;
    private JButton startBtn;

    public Login() {
        setTitle("Smart Quiz Login");
        setSize(400, 250);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(40, 30, 150, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(160, 30, 160, 25);
        add(nameField);

        JLabel idLabel = new JLabel("Student ID:");
        idLabel.setBounds(40, 80, 150, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(160, 80, 160, 25);
        add(idField);

        startBtn = new JButton("Rules");
        startBtn.setBounds(120, 140, 140, 30);
        startBtn.addActionListener(this);
        add(startBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();
        String id = idField.getText().trim();

        if (name.isEmpty() || id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all fields");
            return;
        }

        dispose();
        new Rule(name, id);
    }

    public static void main(String[] args) {
        new Login();
    }
}
