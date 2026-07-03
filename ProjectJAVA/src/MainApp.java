import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        QuestionBank qb = new QuestionBank();

        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        ExamLogic exam = new ExamLogic(qb);
        exam.startExam(input, userName);

        input.close();
    }
}
