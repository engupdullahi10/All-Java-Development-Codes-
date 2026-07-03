import java.util.Scanner;
public class Condition {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean condition= false ;
        double sum= 0;
        while (! condition){
            System.out.println("Enter a number or press -1 to exit: ");
            double num=input.nextDouble();
            if (num==-1){
                condition= true;
            }
            else {
                sum +=num ;
            }
        }
        System.out.println("Total number: " + sum);
        input.close();
    }
}
