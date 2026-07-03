import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(500, 420);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel label1 = new JLabel("First Name:");
        JLabel label2 = new JLabel("Last Name:");
        JLabel label3 = new JLabel("Email:");
        JLabel label4 = new JLabel("Password:");

        JTextField firstName = new JTextField();
        JTextField lastName  = new JTextField();
        JTextField email     = new JTextField();
        JPasswordField password = new JPasswordField();

        JButton button = new JButton("Register");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String fn = firstName.getText().trim();
                String ln = lastName.getText().trim();
                String em = email.getText().trim();
                String pw = new String(password.getPassword());

                if (fn.isEmpty() || ln.isEmpty()) {
                    showError(frame, "First and Last name are required");
                } else if (em.isEmpty()) {
                    showError(frame, "Email is required");
                } else if (!em.contains("@") || !em.contains(".")) {
                    showError(frame, "Please enter a valid email");
                } else if (pw.isEmpty()) {
                    showError(frame, "Password is required");
                } else if (pw.length() < 6) {
                    showError(frame, "Password must be at least 6 characters");
                } else {
                    JOptionPane.showMessageDialog(
                            frame,
                            "Registration Successful!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });

        panel.add(label1);
        panel.add(firstName);
        panel.add(label2);
        panel.add(lastName);
        panel.add(label3);
        panel.add(email);
        panel.add(label4);
        panel.add(password);
        panel.add(new JLabel());
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void showError(JFrame frame, String message) {
        JOptionPane.showMessageDialog(
                frame,
                message,
                "Validation Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
