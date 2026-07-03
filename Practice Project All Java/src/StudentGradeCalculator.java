import java.util.Scanner;
public class StudentGradeCalculator {
   public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the number the subjects: ");
       int num_subject=input.nextInt();
       double total_mark= 0;
       for (int i= 1 ; i<=num_subject; i++){
           System.out.println("Enter the number for each subjects of marks (out of 100) " + i + " : ");
           double marks=input.nextDouble();
           if (marks<0 || marks>100){
               System.out.println("Invalid choice. Please enter a number between 0 to 100:");
               i--;
               continue;
           }
           total_mark+=marks;
       }
       double average= total_mark / num_subject ;
       char garde;
       if (average>=90){
           garde= 'A';
       } else if (average>=80) {
           garde= 'B';
       } else if (average>=70) {
           garde= 'C';
       } else if (average>=60) {
           garde= 'D';
       }else {
           garde= 'F';
       }
       System.out.println("RESULT :");
       System.out.println("Total Marks: " + total_mark);
       System.out.println("Average Percentage: " + average +  " % ");
       System.out.println("Grade: " + garde);
       input.close();
   }
}
