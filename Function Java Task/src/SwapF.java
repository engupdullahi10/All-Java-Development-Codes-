import java.util.Scanner;
public class SwapF {
    public  static  void  swap(int a , int b){
        int temp= a;
        a = b ;
        b=temp;
        System.out.println("Inside Swap:  a = " + a + " b = " + b);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 =input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 =input.nextInt();
        swap(num1 , num2);
        System.out.println("After the swap: num1 = " + num1 + " num2 = " + num2);
    }
}
