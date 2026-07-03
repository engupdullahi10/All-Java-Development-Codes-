//🧩 1. Check if a Year is a Leap Year
//🧠 Logic:
//
//A year is a leap year if:
//
//It is divisible by 4 and
//
//Not divisible by 100, unless it is also divisible by 400

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year: ");
        double year=input.nextDouble();
        // check the condition of the year
        if (year % 400 == 0){
            System.out.println("It is a leap year: ");
        }
        else {
            System.out.println("It is not a leap year: ");
        }
        input.close();
    }
}
