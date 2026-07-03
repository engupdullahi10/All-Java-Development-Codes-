import javax.swing.*;
import java.awt.event.*;

public class HospitalRegistrationSystem {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hospital Registration System");
        frame.setSize(500, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        JLabel nameLabel = new JLabel("Patient Name:");
        nameLabel.setBounds(30, 30, 100, 25);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 25);

        // Age
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(30, 70, 100, 25);

        JTextField ageField = new JTextField();
        ageField.setBounds(150, 70, 200, 25);

        // Department
        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(30, 110, 100, 25);

        String[] departments = {
                "Cardiology",
                "Neurology",
                "Orthopedic",
                "ENT",
                "General"
        };

        JComboBox<String> deptBox =
                new JComboBox<>(departments);

        deptBox.setBounds(150, 110, 200, 25);

        // Symptoms
        JLabel symptomLabel = new JLabel("Symptoms:");
        symptomLabel.setBounds(30, 150, 100, 25);

        JTextArea symptomArea = new JTextArea();

        JScrollPane scroll =
                new JScrollPane(symptomArea);

        scroll.setBounds(150, 150, 250, 100);

        // Button
        JButton registerButton =
                new JButton("Generate Report");

        registerButton.setBounds(150, 280, 150, 30);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String age = ageField.getText();

                String department =
                        (String) deptBox.getSelectedItem();

                String symptoms =
                        symptomArea.getText();

                String report =
                        "----- Patient Report -----\n" +
                                "Name: " + name + "\n" +
                                "Age: " + age + "\n" +
                                "Department: " + department + "\n" +
                                "Symptoms: " + symptoms;

                JOptionPane.showMessageDialog(
                        frame,
                        report
                );
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(ageLabel);
        frame.add(ageField);

        frame.add(deptLabel);
        frame.add(deptBox);

        frame.add(symptomLabel);
        frame.add(scroll);

        frame.add(registerButton);

        frame.setVisible(true);
    }
}