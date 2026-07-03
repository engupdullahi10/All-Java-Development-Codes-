import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    JLabel label;
    JButton button;
    public MyWindow(){
        setTitle("My first Swing App");
        setSize(500 , 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        label=new JLabel("Welcome To Java Swing");
        label.setBounds(100 , 40 , 100 , 100);
        add(label);
        button=new JButton("Click Me");
        button.setBounds(120 , 100 , 100 , 100);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null , "Welcome to Java Swing");
            }
        });
        setVisible(true);
    }
    public static void main(String[] args){
       new  MyWindow();
    }
}
