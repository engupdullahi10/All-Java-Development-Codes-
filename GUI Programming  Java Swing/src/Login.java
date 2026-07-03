import javax.swing.*;
import java.sql.*;

public class Login extends JFrame {

    JTextField userField;
    JPasswordField passField;

    public Login() {

        setTitle("Admin Login");
        setSize(350, 220);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUser = new JLabel("Username");
        JLabel lblPass = new JLabel("Password");

        userField = new JTextField();
        passField = new JPasswordField();

        JButton loginBtn = new JButton("Login");

        lblUser.setBounds(30, 30, 80, 25);
        userField.setBounds(120, 30, 150, 25);

        lblPass.setBounds(30, 70, 80, 25);
        passField.setBounds(120, 70, 150, 25);

        loginBtn.setBounds(120, 120, 100, 30);

        add(lblUser);
        add(userField);
        add(lblPass);
        add(passField);
        add(loginBtn);

        loginBtn.addActionListener(e -> login());

        setVisible(true);
    }

    public void login() {

        String username = userField.getText();
        String password = new String(passField.getPassword());

        try {

            Connection con = DBConnection.getConnection();

            if (con == null) {
                JOptionPane.showMessageDialog(this,
                        "Database Connection Failed");
                return;
            }

            String sql =
                    "SELECT * FROM admin WHERE username=? AND password=?";

            PreparedStatement pst =
                    con.prepareStatement(sql);

            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                JOptionPane.showMessageDialog(this,
                        "Login Successful");

                dispose();

                new StudentGUI();

            } else {

                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password");
            }

            rs.close();
            pst.close();
            con.close();

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Login();
    }
}