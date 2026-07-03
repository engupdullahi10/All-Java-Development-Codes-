import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementJagged {
//Student Management & Performance System (Java)
    //🔹 Project Description
    //
    //This system manages:
    //
    //Student names
    //
    //Courses taken by each student (unequal → jagged array)
    //
    //Marks per course
    //
    //Dynamic student list using ArrayList
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<String> student=new ArrayList<>();
        System.out.print("Enter number of student: ");
        int number=input.nextInt();
        int[][]marks=new int[number][];
        for (int i=0 ; i<marks.length; i++){
            input.nextLine();
            System.out.print("\nEnter student name " + ( i + 1) + ": ");
            String name=input.nextLine();
            student.add(name);
            System.out.print("Enter number of courses: ");
            int course=input.nextInt();
            marks[i]=new  int[course];
            for (int j= 0 ; j<course; j++){
                System.out.print("Enter marks for course " + (j + 1) + ": ");
                marks[i][j]=input.nextInt();
            }
            //OUTPUT SECTION
            System.out.println("\nSTUDENTS RECORD: ");
            for (int s= 0 ; s<student.size(); s++){
                System.out.println(student.get(s) + ": ");
                for (int j=0; j<marks[s].length; j++){
                    System.out.print(marks[i][j] + " ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
