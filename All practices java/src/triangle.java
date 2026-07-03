import java.util.Scanner;
public class triangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your size: ");
        int size=input.nextInt();
        for (int i = 1; i<=size ; i++){
            for (int j= 1; j<size ; j++){
                System.out.print("");
            }
            for (int k= 1; k<=(2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}