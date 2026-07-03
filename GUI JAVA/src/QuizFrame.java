// QuizFrame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizFrame extends JFrame implements ActionListener {

    private JLabel questionLabel;
    private JRadioButton[] options = new JRadioButton[4];
    private ButtonGroup group;
    private JButton nextBtn;

    private Question[] questions;
    private int index = 0;
    private int score = 0;

    private String name, id;

    public QuizFrame(String name, String id) {
        this.name = name;
        this.id = id;

        setTitle("Quiz");
        setSize(600, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loadQuestions();

        questionLabel = new JLabel();
        questionLabel.setBounds(30, 20, 520, 40);
        add(questionLabel);

        group = new ButtonGroup();

        int y = 80;
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            options[i].setBounds(50, y, 450, 25);
            group.add(options[i]);
            add(options[i]);
            y += 40;
        }

        nextBtn = new JButton("Next");
        nextBtn.setBounds(220, 240, 120, 30);
        nextBtn.addActionListener(this);
        add(nextBtn);

        loadQuestion();
        setVisible(true);
    }

    private void loadQuestions() {
        questions = new Question[]{
                new Question("What is Java mainly used for?", new String[]{"Styling websites", "Object-oriented programming", "Image editing", "Networking only"}, 1),
                new Question("Which keyword creates an object?", new String[]{"create", "make", "new", "object"}, 2),
                new Question("Entry point of Java program?", new String[]{"start()", "main()", "run()", "execute()"}, 1),
                new Question("Whole number type?", new String[]{"float", "double", "int", "char"}, 2),
                new Question("Single line comment?", new String[]{"#", "//", "--", "/*"}, 1),
                new Question("Loop that runs at least once?", new String[]{"for", "while", "do-while", "foreach"}, 2),
                new Question("Dynamic collection?", new String[]{"Array", "ArrayList", "String", "Scanner"}, 1),
                new Question("Keyword for inheritance?", new String[]{"implement", "extend", "super", "final"}, 1),
                new Question("Keyword for encapsulation?", new String[]{"private", "public", "static", "void"}, 0),
                new Question("Equality operator?", new String[]{"=", "==", ":=", "equals"}, 1),
                new Question("HTML stands for?", new String[]{"Hyper Text Markup Language", "High Tech", "Home Tool", "None"}, 0),
                new Question("CSS purpose?", new String[]{"Programming", "Styling", "Database", "Network"}, 1),
                new Question("JavaScript runs in?", new String[]{"Browser", "Database", "Compiler", "Kernel"}, 0),
                new Question("Statement ends with?", new String[]{".", ":", ";", ","}, 2),
                new Question("Prevent inheritance?", new String[]{"private", "static", "final", "stop"}, 2),
                new Question("Input class?", new String[]{"Input", "Reader", "Scanner", "System"}, 2),
                new Question("Divide by zero exception?", new String[]{"IO", "Null", "Arithmetic", "Syntax"}, 2),
                new Question("Grid rows/columns layout?", new String[]{"Flow", "Border", "Grid", "Box"}, 2),
                new Question("Constant keyword?", new String[]{"static", "final", "const", "fixed"}, 1),
                new Question("Swing package?", new String[]{"java.io", "java.sql", "javax.swing", "java.net"}, 2)
        };
    }

    private void loadQuestion() {
        group.clearSelection();
        Question q = questions[index];
        questionLabel.setText((index + 1) + ". " + q.getQuestion());
        String[] opts = q.getOptions();
        for (int i = 0; i < 4; i++) {
            options[i].setText(opts[i]);
        }
        if (index == questions.length - 1) nextBtn.setText("Finish");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selected = -1;
        for (int i = 0; i < 4; i++) {
            if (options[i].isSelected()) selected = i;
        }

        if (selected == -1) {
            JOptionPane.showMessageDialog(this, "Select an answer first");
            return;
        }

        if (selected == questions[index].getCorrectIndex()) score++;
        index++;

        if (index < questions.length) {
            loadQuestion();
        } else {
            dispose();
            new ResultFrame(name, id, score, questions.length);
        }
    }
}
