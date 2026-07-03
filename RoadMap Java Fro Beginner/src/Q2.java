
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        // Age Eligibility System
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("You are Eligibility to vote");
        }else{
            System.out.println("You are not Eligibility to vote");
        }
    }
}