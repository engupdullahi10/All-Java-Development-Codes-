// Rule.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rule extends JFrame implements ActionListener {

    private String name, id;

    public Rule(String name, String id) {
        this.name = name;
        this.id = id;

        setTitle("Quiz Rules");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea rules = new JTextArea(
                "Rules:\n" +
                        "1. Each question has one correct answer.\n" +
                        "2. No back navigation.\n" +
                        "3. Score shown at end.\n" +
                        "4. Click Next to move forward.\n"
        );
        rules.setEditable(false);
        rules.setFont(new Font("Arial", Font.PLAIN, 14));
        add(rules, BorderLayout.CENTER);

        JButton startBtn = new JButton("Start Quiz");
        startBtn.addActionListener(this);
        add(startBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        new QuizFrame(name, id);
    }
}
