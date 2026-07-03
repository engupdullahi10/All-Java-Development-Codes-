import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteFile {
    // FileWriting
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        try(FileWriter writer=new FileWriter("studentData.txt" , true)) {
            System.out.println("Enter your name: ");
            String name=input.nextLine();
            System.out.println("Enter your age: ");
            int age=input.nextInt();
            System.out.println("Enter your ID: ");
            int id=input.nextInt();
            input.nextLine();
            System.out.println("Enter your subject: ");
            String subject=input.nextLine();
            System.out.println("Enter your marks: ");
            int mark=input.nextInt();
            writer.write("Hello! Eng Abdullahi , Welcome to java file handling");
            writer.write("\nI'm Eng Abdullahi and junior Software engineering in java programming.");
            writer.write("\nJava File Handling allows you to create, read, write, update, and delete files on your computer using Java programs.");
            writer.write( "\nName: " + name );
            writer.write("\nAge: " + age);
            writer.write("\nID: " + id);
            writer.write("\nSubject: " + subject);
            writer.write("\nMarks: " + mark);
            writer.close();
            System.out.println("Data written successfully!. ");
        }catch (IOException e){
            System.out.println("Error: File already exist "+ e.getMessage());
        }
        input.close();
    }
}
