import java.util.Scanner;

public class Sum_of_numbers {
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num=input.nextDouble();
        double sum= 0;
        for (int i=0; i<=10; i++){
            sum+= i;
        }
        System.out.println("The sum is: " + sum);
        input.close();
    }
}
