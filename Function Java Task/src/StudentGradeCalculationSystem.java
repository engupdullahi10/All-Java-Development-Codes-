import java.util.Scanner;
public class StudentGradeCalculationSystem {
    public  static double calculateAverage(int m1, int m2, int m3){
      return m1 + m2 + m3 ;
    }
    public static  char giveGrade(double average){
        if (average>=90){
            return 'A';
        } else if (average>=80) {
            return  'B';
        } else if (average>=70) {
            return 'C';
        } else if (average>=60) {
            return 'D';
        }else {
            return 'F';
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name=input.nextLine();
        while (true) {
            System.out.println("Enter the first marks: ");
            int marks1 = input.nextInt();
            System.out.println("Enter the second marks: ");
            int marks2 = input.nextInt();
            System.out.println("Enter the third marks: ");
            int marks3 = input.nextInt();
            double average = calculateAverage(marks1, marks2, marks3);
            System.out.println("Average: " + average);
            char grade= giveGrade(average);
            System.out.println("Grade: " + grade);
            System.out.println("Do you want to calculate another student's grade? (Y/N): ");
            char choice = input.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            }
        }
        input.close();
    }
}
