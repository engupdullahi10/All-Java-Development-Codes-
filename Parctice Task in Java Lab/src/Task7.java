import java.util.Scanner;

public class Task7 {
    public  static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=input.nextInt();
        for (int i= 0 ; i <=20; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        input.close();
    }
}
