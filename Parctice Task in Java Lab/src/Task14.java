import java.util.Scanner;
public class Task14 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a students ID: ");
        String studentID=input.nextLine();
        System.out.println("Enter a password: ");
        String password=input.nextLine();
        if (studentID.length()<5){
            System.out.println("Invalid: ");
        } else if (password.length()<6) {
            System.out.println("Invalid:");

        }else {
            System.out.println("Log successfully: ");
        }
        input.close();
    }
}
