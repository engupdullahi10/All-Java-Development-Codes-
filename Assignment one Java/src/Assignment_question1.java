import java.util.Scanner;
public class Assignment_question1 {
    public static void  main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of  absents: ");
        int absent=input.nextInt();
        if (absent>12){
            System.out.println("The student automatically fails the course and receives a ‘FA’ grade");
        }else {
            System.out.println("Course Selection Menu: ");
            System.out.println("1.Single Component Course: ");
            System.out.println("2.Dual Component Course (Theory + Lab)");
            System.out.println("Enter you choice (1 or 2): ");
            int choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the marks (out of 100): ");
                    int mark=input.nextInt();
                    String grade=calculationGrade(mark);
                    System.out.println("Grade: " + grade);
                    break;
                case  2:
                    System.out.println("Enter theory marks (out of 100): ");
                    int theoryMark=input.nextInt();
                    System.out.println("Enter lab marks (out of 100): ");
                    int labMark=input.nextInt();
                    if (theoryMark<60){
                        System.out.println("The student fails both Theory and Lab: ");
                    }else {
                        String theoryGrade=calculationGrade(theoryMark);
                        String labGrade=calculationGrade(labMark);
                        System.out.println("Theory Grade: " +theoryGrade);
                        System.out.println("Lab Grade: " + labGrade);

                    }
                    break;
                default:
                    System.out.println("Invalid Choice. Please select 1 or 2: ");

            }
        }
        input.close();

    }
    public  static  String calculationGrade(int mark){
        if (mark>=90){
            return "A";
        } else if (mark>=80){
            return  "B";

        } else if (mark>=70) {
            return  "C";

        } else if (mark>=60) {
            return "D";

        }else {
            return  "F";
        }
    }
}
