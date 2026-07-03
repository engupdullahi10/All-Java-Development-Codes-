import java.util.Scanner;
public class Task12 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter size of square number: ");
        int num=input.nextInt();
        for (int i= 1 ; i<=num ; i++){
            for (int j= 1 ; j<=num ; j++){
                if (i==1||i==num||j==1||j==num){
                    System.out.print("*");
                }else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
