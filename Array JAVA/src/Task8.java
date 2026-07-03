import java.util.Scanner;
public class Task8 {
    //Task 08: Employee Work Hours
    //	Store hours in a jagged array
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] work=new int[3][];
        work[0]=new int[4];
        work[1]=new int[3];
        work[2]= new int[2];
        for (int i=0 ; i<work.length; i++){
            System.out.println("Employee Work Hours " + (i + 1) + ": ");
            for (int j=0; j<work[i].length; j++){
                System.out.print("Hours " + (j + 1) + ": ");
                work[i][j]=input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\nEmployee Record");
        for (int i=0; i<work.length; i++){
            System.out.println("Work " + (i + 1) + ": ");
            for (int j=0; j<work[i].length; j++){
                System.out.print(work[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
