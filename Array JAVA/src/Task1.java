import java.util.Scanner;
public class Task1 {
    //Task 01: Monthly Sales Report
    //jagged array
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [][] weeks=new int[3][];
        weeks[0]=new int[4];
        weeks[1]=new int[5];
        weeks[2]=new int[6];
        for (int i=0 ; i<weeks.length; i++){
            System.out.println("Enter sales for Week " + (i + 1) + ": ");
            for (int j=0; j<weeks[i].length; j++){
                System.out.println("Day " + ( j + 1 ) + ": ");
                weeks[i][j]=input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n--- Sales Report ---");
        for (int i=0; i<weeks.length;i++){
            System.out.print("Week " + (i + 1) + ": ");
            for (int j=0; j<weeks[i].length; j++){
                System.out.print(weeks[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
