import java.util.Scanner;
public class Student_grade_calculation {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter the student name: ");
            String name=input.nextLine();
            System.out.println("Enter the number of the subjects: ");
            double num_subject=input.nextDouble();
            double total_mark= 0;
            for (int i = 1 ; i <= num_subject ; i++){
                System.out.println("Enter the  marks of the student: " + i + ("out of 100"));
                double mark=input.nextDouble();
                if (mark<0 || mark>100){
                    System.out.println("Invalid choice. Please enter a number between 0 to 100: ");
                    i--;
                    continue;
                }
                total_mark +=mark;
            }
            double average= total_mark / num_subject;
            char  grade;
            if (average>=90){
                grade='A' ;

            } else if (average>=80) {
                grade='B';

            } else if (average>=70) {
                grade='C';

            } else if (average>=60) {
                grade='D';

            }else {
                grade='F';
            }
            System.out.println("\n--- Student Report ---");
            System.out.println("Name: " + name);
            System.out.println("Total Marks: " + total_mark);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);
            System.out.print("\nDo you want to calculate another student's grade? (y/n): ");
            choice = input.next().charAt(0);
            input.nextLine();
        }while (choice == 'y' || choice == 'Y');
        System.out.println("✅ Thank you for using the Student Grade Calculator!");
        input.close();
    }
}
