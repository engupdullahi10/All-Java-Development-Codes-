import java.util.Scanner;

public class Task2 {
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first subject: ");
        double subject1=input.nextDouble();
        System.out.println("Enter the second subject: ");
        double subject2=input.nextDouble();
        System.out.println("Enter the third subject: ");
        double subject3=input.nextDouble();
        System.out.println("Enter the froth subject: ");
        double subject4=input.nextDouble();
        System.out.println("Enter the fifth  subject: ");
        double subject5= input.nextDouble();
        double total= subject1 + subject2 + subject3 + subject4 + subject5;
        double average= total / 5 ;
        char grade;
        if (average>=90){
            grade='A';

        } else if (average>=80) {
            grade='B';

        } else if (average>=70) {
            grade='C';

        } else if (average>=60) {
            grade='D';

        }else {
            grade='F';
        }
        //Output the result of the student:
        System.out.println("The report of the student inform: ");
        System.out.println("Total marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        if (average>=50){
            System.out.println("Pass: ");

        }else {
            System.out.println("Fail: ");
        }
        input.close();

    }
}
