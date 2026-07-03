import java.util.Scanner;
public class Task19 {
    public  static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a age: ");
        int age=input.nextInt();
        System.out.println("Enter amount: ");
        int amount=input.nextInt();
        if (age<18){
            System.out.println("Not eligible to watch this movie: ");

        }else {
            if (amount<700){
                System.out.println("Insufficient amount: ");
            }else {
                System.out.println("Ticket Booked Successfully!: ");
            }
        }
        input.close();
    }
}
