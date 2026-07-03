import javax.swing.*;
import java.awt.*;
public class StudentRegistrationForm {
    //Student Registration Form
    // Java Swing
    public static void main(String[] args){
        JFrame frame= new JFrame("Student Registration Form");
        JTextField username=new JTextField(10);
        JTextField ageFiled=new JTextField(10);
        JTextField rollNumber=new JTextField(10);
        JRadioButton maleRadio=new JRadioButton( "Male");
        JRadioButton femaleRadio=new JRadioButton("female");
        ButtonGroup genderRadio=new ButtonGroup();
        genderRadio.add(maleRadio);
        genderRadio.add(femaleRadio);
        JButton registration=new JButton("Register");
        frame.setLayout(new GridLayout(5, 2));
        frame.add(new JLabel("Student Name: "));
        frame.add(username);
        frame.add(new JLabel("Age: "));
        frame.add(ageFiled);
        frame.add(new JLabel("Roll Number: "));
        frame.add(rollNumber);
        frame.add(new JLabel("Gender: "));
        JPanel genderPanel=new JPanel(new FlowLayout());
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        frame.add(genderPanel);
        frame.add(registration);
        registration.addActionListener(e -> {
            if (username.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(frame , "Student name is  required.");
            } else if (ageFiled.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Age is required");
            } else if (rollNumber.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Roll number is required");
            } else if (!maleRadio.isSelected() && !femaleRadio.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Please select gender. ");
            } else {
                JOptionPane.showMessageDialog(frame, "Student Registration Form successfully.");
            }
        });
        frame.setSize(400 , 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
