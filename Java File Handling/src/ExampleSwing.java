import javax.swing.*;
import java.awt.*;
public class ExampleSwing {
    // GUI Functional Requirements
    // Java Swing
    public static void main(String[] args){
        JFrame frame=new JFrame("Login");
        //User input
        JTextField userFiled=new JTextField(5);
        JPasswordField passwordField=new JPasswordField(5);
        JButton loginBut=new JButton("Login");
        frame.setLayout(new GridLayout(3 , 2));
        frame.add(new JLabel("Username: "));
        frame.add(userFiled);
        frame.add(new JLabel("Password: "));
        frame.add(passwordField);
        frame.add(loginBut);
        loginBut.addActionListener(e -> {
            if (userFiled.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame , "username Required");
            }else {
                JOptionPane.showMessageDialog(frame , "login Successfully.");
            }
        });
        frame.setSize(350 , 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
