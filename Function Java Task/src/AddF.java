import java.util.Scanner;
//Task 2: Add Two Numbers
public class AddF {
    public static int Add(int a , int b){
        return a + b ;
    }
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number. ");
        int num1=input.nextInt();
        System.out.println("Enter the seconde number. ");
        int num2=input.nextInt();
        int result=Add(num1 , num2);
        System.out.println("The sum is: " + result);
        input.close();
    }

}
