import java.util.Scanner;
public class StudentMarksAnalyzer {
    public  static  void main(String[] args){
        //Student Marks Analyzer
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To The Student Marks Analyzer: ");
        System.out.println("Enter the number of students: ");
        int number=input.nextInt();
        int [] marks=new int[number];
        for (int i= 0; i<number; i++){
            System.out.println("Enter the marks of the students " + (i + 1) + ":");
            marks[i]=input.nextInt();
        }
        int total=0;
        int heightMarks= marks[0];
        int lowMarks= marks[0];
        for (int m:marks){
            total+=m;
            if (m>heightMarks){
            }if (m<lowMarks){
                lowMarks= m ;
            }
        }
        double average= (double) total / marks.length;
        System.out.println("Student Marks Analyzer Summary: ");
        System.out.println("Student Number: " + number);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Mark: " + heightMarks);
        System.out.println("Lowest Mark: " + lowMarks);
        System.out.println("Thanks your for using Students Marks Analyzer. ");
        input.close();
    }
}
