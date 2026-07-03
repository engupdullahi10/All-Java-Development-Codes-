import java.util.Scanner;
public class number {
    public static  void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num= 25;
        while (true){
            System.out.println("Enter a number: ");
            double num1=input.nextDouble();
            if(num==num1){
                System.out.println("Well Done!: ");
                break;
            }
            else {
                System.out.println("Invalid number:");
            }
        }
        input.close();
    }
}
