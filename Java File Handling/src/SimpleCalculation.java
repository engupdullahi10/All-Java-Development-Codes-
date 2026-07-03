import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculation {
    // Simple Calculation Math
    // Java Swing
    public static void main(String[] args){
        JFrame frame=new JFrame("Simple Calculation");
        frame.setSize(450 , 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        JPanel panel=new JPanel(new GridLayout(3 , 2 , 10 , 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20 , 20 , 20 , 20));
        JTextField numFiled=new JTextField(10);
        JTextField num1Filed=new JTextField(10);
        JButton btu=new JButton("ADD");
        JLabel label1 =new JLabel("Number 1: ");
        frame.add(numFiled);
        JLabel label2= new JLabel("Number 2: ");
        frame.add(num1Filed);
        frame.add(new JLabel("ADD"));
        frame.add(btu);
        JLabel result=new JLabel();
        result.setForeground(Color.blue);
        result.setFont(new Font("Arial" , Font.TYPE1_FONT , 30));
        btu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(numFiled.getText());
                    int n2 = Integer.parseInt(num1Filed.getText());
                    int sum = n1 + n2;
                    result.setText("Result: " + sum);
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!" , "Input Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        panel.add(label1);
        panel.add(numFiled);
        panel.add(label2);
        panel.add(num1Filed);
        panel.add(btu);
        panel.add(result);
        frame.add(panel);
        frame.setVisible(true);

    }
}
