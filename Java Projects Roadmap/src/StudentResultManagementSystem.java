import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;
public class StudentResultManagementSystem {
    //Student Result Management System
    public static  char calculationGrade(int marks){
        if (marks>=90){
            return 'A';
        } else if (marks>=80) {
            return 'B';
        } else if (marks>=70) {
            return  'C';
        } else if (marks>=60) {
            return  'D';
        }else {
            return 'F';
        }
    }
    public static String  checkPassFail(double average){
        if (average>=50){
            return "Pass";
        }else {
            return "Fail";
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Student Result Management System: ");
        System.out.print("Enter the student name: ");
        String name=input.nextLine();
        System.out.print("Enter the student ID: ");
        String id=input.nextLine();
        System.out.print("Enter the number of the subjects: ");
        int number=input.nextInt();
        int total= 0;
        for (int i=0; i<number;i++){
            System.out.print("Enter the Marks: ");
            int mark=input.nextInt();
            total+=mark;
        }
        double aver=(double) total / number;
        char grade=calculationGrade((int)aver);
        String result=checkPassFail(aver);
        System.out.println("Simple OutPut Result: ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + aver);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
        // File Handling Exception
        try {
            FileWriter fw= new FileWriter("student.txt" , true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Name | ID | TotalMarks | Average | Grade | Result");
            bw.newLine();
            bw.write(name + " | " + id + " | " + total + " | " + aver + " | " + grade + " | " + " | " + result);
            bw.newLine();
            bw.close();
            fw.close();
            System.out.println("\nStudent file creating successful. ");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        input.close();
    }
}
