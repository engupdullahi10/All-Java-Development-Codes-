import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        // Multiplication Table :
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        System.out.println("\nMultiplication is: " + num);
        for (int i = 1 ; i <=10; i++){
            System.out.println(num + " x " + i + " = " + (num * i) );

        }
        input.close();
    }
}
