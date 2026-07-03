import java.util.Scanner;
public class PrintNumbers {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your size: ");
        int size=input.nextInt();
        for (int i= 1 ;  i <=size ; i++){
            System.out.println(i);
        }
        //input.close();

    }
}
