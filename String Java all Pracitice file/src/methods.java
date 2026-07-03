import java.util.Scanner;
public class methods {
    // FUNCTION METHODS
    static int add(int a , int b){
        return a + b;
    }
    static int difference(int a , int b){
        return a - b ;
    }
    static int multiple(int a , int b){
        return a * b ;
    }
    static int division(int  a , int b) {
        if (b==0){
            System.out.println("Division is not allowed 0.");
            return 0 ;
        }
        return a / b ;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1=input.nextInt();
        System.out.println("Enter your second number: ");
        int num2=input.nextInt();
        System.out.println("Enter your choice operation (+ , - , * , /): ");
        int choice=input.next().charAt(0);
        int result= 0;
        switch (choice){
            case '+':
                result= add(num1 , num2);
                break;
            case '-':
                result=difference(num1 , num2);
                break;
            case '*':
                result= multiple(num1 , num2);
                break;
            case '/':
                result= division(num1 , num1);
                break;
            default:
                System.out.println("Invalid operation. ");
                return;
        }
        System.out.println("Result is: " + result);
    }
}
