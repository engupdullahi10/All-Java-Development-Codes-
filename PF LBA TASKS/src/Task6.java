import java.util.Scanner;

public class Task6 {
    //Task 06: Power Calculation using Recursion
    public static int powerCalculation(int base , int power){
        if (power==0){
            return  1;
        }
        return base * powerCalculation(base , power-1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base =input.nextInt();
        System.out.println("Enter power: ");
        int power=input.nextInt();
        int result= powerCalculation(base , power);
        System.out.println( base + " raised to the power " + power + " is : " + result);
        input.close();
    }
}
