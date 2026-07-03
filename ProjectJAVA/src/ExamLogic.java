import java.util.Scanner;

public class ExamLogic {

    private QuestionBank qb;
    private int score = 0;

    public ExamLogic(QuestionBank qb) {
        this.qb = qb;
    }

    public void startExam(Scanner input, String userName) {

        for(int i = 0; i < qb.getTotalQuestions(); i++) {
            System.out.println("\nQ" + (i+1) + ": " + qb.questions[i]);
            for(int j = 0; j < 4; j++) {
                System.out.println((j+1) + ". " + qb.options[i][j]);
            }

            int ans = 0;
            boolean valid = false;

            while(!valid) {
                System.out.print("Choose option (1-4): ");
                try {
                    ans = input.nextInt();
                    input.nextLine();

                    if(ans < 1 || ans > 4) {
                        System.out.println("Invalid option! Choose 1-4.");
                    } else {
                        valid = true;
                    }

                } catch(Exception e) {
                    System.out.println("Invalid input! Enter a number 1-4.");
                    input.next();
                }
            }

            if(ans == qb.correctAnswers[i]) {
                score++;
            }
        }

        showResult(userName, input);
    }

    private void showResult(String userName, Scanner input) {

        int total = qb.getTotalQuestions();
        double percentage = 0;
        if(total > 0){
            percentage = ((double) score / total) * 100;
        }

        String grade;
        if(percentage >= 85) grade = "A";
        else if(percentage >= 75) grade = "B";
        else if(percentage >= 65) grade = "C";
        else if(percentage >= 50) grade = "D";
        else grade = "F";

        System.out.println("\n===== Exam Result =====");
        System.out.println("Name: " + userName);
        System.out.println("Score: " + score + "/" + total);
        System.out.println("Grade: " + grade);

        ResultManager.saveResult(userName, score, total, grade);

        System.out.println("\nDo you want to see previous results? (yes/no)");
        String seePrev = input.next();
        if(seePrev.equalsIgnoreCase("yes")) {
            ResultManager.showPreviousResults();
        }

        System.out.println("\nDo you want to reset all previous results? (yes/no)");
        String reset = input.next();
        if(reset.equalsIgnoreCase("yes")) {
            ResultManager.resetResults();
        }
    }
}
