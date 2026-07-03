//2. Find the Largest of Three Numbers

import java.util.Scanner;

public class largest_of_three_numbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1=input.nextDouble();
        System.out.println("Enter the second number: ");
        double num2=input.nextDouble();
        System.out.println("Enter the third number: ");
        double num3=input.nextDouble();
        if (num1 > num2  &&  num1 > num3){
            System.out.println("The first number is great: ");
        } else if (num2 > num1 && num2 >  num3) {
            System.out.println("The second number is great: ");

        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The third number is great: ");

        }
        else {
            System.out.println("All numbers are equal: ");
        }
        input.close();
    }
}
