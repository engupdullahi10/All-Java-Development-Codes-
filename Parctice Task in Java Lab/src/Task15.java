import java.util.Scanner;
public class Task15 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of  absent: ");
        int absents=input.nextInt();
        if (absents>12){
            System.out.println("The student automatically fails the course and receives a ‘FA’ grade. :");
        }else {
            System.out.println("Course Selection Menu: ");
            System.out.println("1.Single Component Course: ");
            System.out.println("2.Dual Component Course (Theory + Lab): ");
            System.out.println("Enter your choice (1 or 2): ");
            int choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the marks of (out of 100): ");
                    int mark=input.nextInt();
                    String grade=calculationGrade(mark);
                    System.out.println("Grade: " + grade);
                    break;
                case  2:
                    System.out.println("Enter the mark of the theory (out of 100): ");
                    int theoryMark=input.nextInt();
                    System.out.println("Enter the mark of the  lab (out of 100): ");
                    int labMark=input.nextInt();
                    if (theoryMark<60){
                        System.out.println("The student fails both Theory and Lab: ");

                    }else {
                        String theoryGrade=calculationGrade(theoryMark);
                        String labGrade=calculationGrade(labMark);
                        System.out.println("Theory Grade: " + theoryMark);
                        System.out.println("Lab Grade: " + labMark);

                    }
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again: ");


            }
        }
        input.close();
    }
    public  static  String calculationGrade(int mark){
        if (mark>=90){
            return  "A";

        } else if (mark>=80) {
            return  "B";

        } else if (mark>=70) {
            return  "C";

        } else if (mark>=60) {
            return  "D";

        }else {
            return  "F";
        }
    }
}
