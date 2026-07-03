import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name=input.nextLine();
        System.out.println("Enter you age: ");
        double age=input.nextDouble();
        System.out.println("Enter you marks: ");
        double marks=input.nextDouble();
        // Student details:
        System.out.println("\n Student Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        input.close();

    }
}