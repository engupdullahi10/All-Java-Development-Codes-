import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a , b , temp;
        System.out.println("Swap Two Numbers");
        System.out.print("Enter the first number: ");
        a=input.nextInt();
        System.out.print("Enter the second number: ");
        b=input.nextInt();
        temp= a;
        a= b;
        b=temp;
        System.out.println("After Swap number");
        System.out.println("Swap number a: " + a);
        System.out.println("Swap number b: " + b);

    }
}
