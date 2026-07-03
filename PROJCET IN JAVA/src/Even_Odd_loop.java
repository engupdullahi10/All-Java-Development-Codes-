import java.util.Scanner;

public class Even_Odd_loop {
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        //Even Number
        System.out.println("\nEven number: ");
        for (int i =  1  ; i <= num ; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        //Odd number :
        System.out.println("\nOdd number: ");
        for (int i = 1 ; i <= num ; i++){
            if (i% 2 !=0){
                System.out.println(i);
            }
            input.close();;
        }
    }
}
