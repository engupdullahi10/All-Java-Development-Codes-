import java.util.Scanner;
public class Is_condition {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean condition= false;
        double myNum= 20;
        int i = 0;
        while (!condition){
            System.out.println("Enter a number: ");
            double num= input.nextDouble();
            if (num==myNum){
                System.out.println("Wow Correct you are guess number: ");
                condition= true;
            }
            else {
                System.out.println("Wrong guess number. Try again:  ");
            }
        }
        System.out.println("Well Done: ");
        input.close();
    }
}
