import java.util.Scanner;
public class Task13 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= input.nextInt();
        System.out.println("Number + Cube: ");
        for (int i= 1 ; i<=n; i++){
            int cube= i * i* i;
            System.out.println( i + "    " + cube);
        }
        input.close();
    }
}
