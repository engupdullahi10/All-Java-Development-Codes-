import java.util.Scanner;

public class LoginSystem {
    //Login System (Mini Project)
    //✅ 5. Login System (Mini Project)
    //
    //Description:
    //
    //Ask username + password
    //
    //Compare with stored values
    //
    //Allow 3 attempts
    //
    //Skills: string comparison, loops
    //Difficulty: ⭐ Easy
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String storeUseName= "Eng Abdullahi";
        String storePassword= "13137990";
        int attempt= 3;
        while (attempt>0){
            System.out.println("Enter your name: ");
            String name=input.nextLine();
            System.out.println("Enter your password: ");
            String password=input.nextLine();
            if (name.equalsIgnoreCase(storeUseName) && password.equalsIgnoreCase(storePassword)){
                System.out.println("Login Successful! Welcome " + name);
                break;
            }else {
                attempt--;
                System.out.println("Incorrect username & password. ");
                if (attempt>0){
                    System.out.println("Attempts left: " + attempt);
                }else {
                    System.out.println("Account Locked. Try again . ");
                }
            }
        }
        input.close();
    }
}
