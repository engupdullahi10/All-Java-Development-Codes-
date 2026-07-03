import java.util.Scanner;
public class Task2 {
    //Task 02: Hospital Patient Record
    //jagged array:
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[][] patient=new int[3][];
        patient[0]=new int[3];
        patient[1]=new int[5];
        patient[2]=new int[2];
        for (int i=0; i<patient.length;i++){
            System.out.println("Enter Patient IDs for Ward : " + (i + 1) + ": ");
            for (int j=0; j<patient[i].length; j++){
                System.out.print("ID " + ( j + 1) + ": ");
                patient[i][j]=input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n--- Patient Record ---");
        for (int i=0 ; i<patient.length;i++){
            System.out.print("Ward A " + (i + 1 ) + ": ");
            for (int j=0; j<patient[i].length; j++){
                System.out.print(patient[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
