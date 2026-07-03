import java.util.Scanner;

public class Task2 {
    //Task 02: Fibonacci Series Genarator (Recursion)
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        return fibonacci(n- 1) + fibonacci(n -1);
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int number=input.nextInt();
        System.out.println("SIMPLE OUTPUT: ");
        System.out.println("Fibonacci Series: ");
        for (int i=0 ; i<number; i++){
            System.out.println(fibonacci(i) + " ");
        }
        input.close();
    }
}
