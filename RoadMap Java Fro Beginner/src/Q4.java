
import java.util.Scanner;

//Simple Calculator
public class Q4{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Simple Calculator");
        System.out.println("Enter the first number: ");
        int number=input.nextInt();
        System.out.println("Enter the second number: ");
        int num=input.nextInt();
        System.out.println("Take operator (+, -, *, /)");
        char choice=input.next().charAt(0);
        int result= 0;
        switch(choice){
            case '+':
                result=number + num;
                break;
            case '-':

                result=number - num;
                break;
            case '*':
                result=number * num;
                break;
            case '/':
                if(num!=0){
                    result=number / num;
                }else{
                    System.out.println("Error: Divisi0n isn't zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operation ");
                return;
        }
        System.out.println("The result is: " + result);

    }
}