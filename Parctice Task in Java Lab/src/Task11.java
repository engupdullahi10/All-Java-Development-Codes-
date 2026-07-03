import java.util.Scanner;

public class Task11 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of the rows: ");
        int rows= input.nextInt();
        for (int i = 1 ; i <= rows ; i++){
            for (int j= 1 ; j<rows ; j++){
                System.out.print(" ");
                }
            for (int k = 1 ; k<=(2 * i -1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
