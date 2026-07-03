import java.util.Scanner;
public class StudentMarks {
    //Project Idea: Student Marks Analyzer
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of student: ");
        int number=input.nextInt();
        int [] mark=new int[number];
        for (int i=0; i<number; i++){
            System.out.println("Enter marks of student " + ( i + 1) + ": ");
            mark[i]=input.nextInt();
        }
        //DISPLAY MARKS
        System.out.println("\nAll Students Marks: ");
        for (int marks: mark){
            System.out.print(marks + " ");
        }
        //find MAx , MIN , SUM , PASS AND FAILED;
        int max=mark[0];
        int min=mark[0];
        int sum=0;
        int pass= 0;
        int fail= 0;
        for (int marks: mark){

            if (marks>max) max=marks;
            if (marks<min) min=marks;
            sum+=marks;
            if (marks>=40) pass++;
            else fail++;
        }
        double aver=(double) sum / number;
        //RESULT OUTPUT
        System.out.println("\nSIMPLE OUTPUT RESULT: ");
        System.out.println("Student NUMBER: " + number);
        System.out.println("Height Marks: " + max);
        System.out.println("Lowest Marks: " + min);
        System.out.println("Average Marks: " + aver);
        System.out.println("Pass Student: " + pass);
        System.out.println("Fail Student: " + fail);
        input.close();
    }
}
