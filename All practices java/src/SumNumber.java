import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num= input.nextDouble();
        double sum= 0;
        int i = 0;
        while (i <=num){
            sum+=i;
            i++;
        }
        System.out.println("Number is: " + num);
        System.out.println("Total number is: " + sum);
        input.close();
    }
}
