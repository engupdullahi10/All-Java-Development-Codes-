import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeBill {

    public static void main(String[] args) {
        new EmployeeBillCalculate();
    }
}

class EmployeeBillCalculate extends JFrame {

    private JTextField nameField;
    private JTextField salaryField;
    private JButton button;

    public EmployeeBillCalculate() {

        setTitle("Employee Payroll System");
        setSize(450, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Employee Name:");
        label1.setBounds(30, 40, 140, 25);

        nameField = new JTextField();
        nameField.setBounds(180, 40, 200, 25);

        JLabel label2 = new JLabel("Basic Salary:");
        label2.setBounds(30, 80, 140, 25);

        salaryField = new JTextField();
        salaryField.setBounds(180, 80, 200, 25);

        button = new JButton("Generate Bill");
        button.setBounds(140, 140, 150, 35);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String name = nameField.getText();

                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Enter employee name!");
                        return;
                    }

                    double basicSalary = Double.parseDouble(salaryField.getText());

                    // Allowances
                    double hra = basicSalary * 0.20;
                    double medical = basicSalary * 0.10;
                    double transport = basicSalary * 0.05;

                    double grossSalary = basicSalary + hra + medical + transport;

                    // Deduction
                    double tax = grossSalary * 0.10;

                    double netSalary = grossSalary - tax;

                    String bill =
                            "========= EMPLOYEE PAYROLL BILL =========\n\n" +
                                    "Employee Name : " + name + "\n\n" +
                                    "Basic Salary  : " + basicSalary + "\n" +
                                    "HRA (20%)     : " + hra + "\n" +
                                    "Medical (10%) : " + medical + "\n" +
                                    "Transport (5%): " + transport + "\n\n" +
                                    "Gross Salary  : " + grossSalary + "\n" +
                                    "Tax (10%)     : " + tax + "\n\n" +
                                    "-----------------------------------------\n" +
                                    "NET SALARY    : " + netSalary + "\n" +
                                    "=========================================";

                    JOptionPane.showMessageDialog(null, bill);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter valid salary!",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        add(label1);
        add(nameField);
        add(label2);
        add(salaryField);
        add(button);

        setVisible(true);
    }
}
