import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
// class User
class User{
    private String username;
    private String email;
    private String password;
    private String bio;
    public User(String username , String email , String password , String bio){
        this.username=username;
        this.email=email;
        this.password=password;
        this.bio=bio;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    // show User Details
    public void showUserDetail(){
        System.out.println("\n====Simple Instagram User System====");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Bio: " + bio);
    }
}
public class Instagram {
    // 1. Simple Instagram User System
    static ArrayList<User> users=new ArrayList<>();
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Simple Instagram User System");
        System.out.print("Enter the username: ");
        String name=input.nextLine();
        System.out.print("Enter the email: ");
        String email=input.nextLine();
        System.out.print("Enter the password: ");
        String pass=input.nextLine();
        System.out.print("Enter the bio: ");
        String bio=input.nextLine();
        User user=new User(name , email , pass , bio);
        // Add user list
        users.add(user);
        // Save Data For user
        saveData();
        // Read File
        ReadFile();
        // Display
        user.showUserDetail();
        input.close();
    }
    // Save Date User
    public static void saveData(){
        try {
            FileWriter fw=new FileWriter("user.txt");
            for (User u: users){
                fw.write(u.getUsername() + " , "
                + u.getEmail() + " , "
                        + u.getPassword() + " , "
                        + u.getBio()+ "\n");
            }
            fw.close();
            System.out.println("User data save successfully.");
        }catch (IOException e){
            System.out.println("Error data ");
        }
    }
    // Read File
    public static void ReadFile(){
        try {
            FileReader fr=new FileReader("user.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while ((line=br.readLine()) !=null){
                String[] data=line.split(" ,");
                if (data.length==4){
                    System.out.println("Username: " +data[0].trim());
                    System.out.println("Email: " +data[1].trim());
                    System.out.println("Password: " +data[2].trim());
                    System.out.println("Bio: " + data[3].trim());
                }
            }
            fr.close();
            br.close();
        }catch (IOException e){
            System.out.println("Error read file.");
        }
    }
}
