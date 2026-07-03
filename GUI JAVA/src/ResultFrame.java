// ResultFrame.java
import javax.swing.*;
import java.awt.*;

public class ResultFrame extends JFrame {

    public ResultFrame(String name, String id, int score, int total) {
        setTitle("Result");
        setSize(400, 250);
        setLayout(new GridLayout(4, 1));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Student: " + name, SwingConstants.CENTER));
        add(new JLabel("ID: " + id, SwingConstants.CENTER));
        add(new JLabel("Score: " + score + " / " + total, SwingConstants.CENTER));

        JButton exit = new JButton("Exit");
        exit.addActionListener(e -> System.exit(0));
        add(exit);

        setVisible(true);
    }
}
