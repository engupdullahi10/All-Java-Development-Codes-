import java.util.Scanner;
public class Task1 {
    public  static  void  main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        String studentId=input.nextLine();
        System.out.println("Enter Password: ");
        String password=input.nextLine();
        if (studentId.length() <5){
            System.out.println("Invalid ID: ");
        } else if (password.length() < 6) {
            System.out.println("Weak Password: ");

        }else {
            System.out.println("Login Successful: ");
        }
        input.close();
    }
}
