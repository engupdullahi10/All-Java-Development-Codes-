import java.util.Scanner;
//2D ARRAY
public class ArrayAga {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  number of rows: ");
        int rows=input.nextInt();
        System.out.println("Enter number of columns: ");
        int columns=input.nextInt();
        int[][] matrix=new int[rows][columns];
        System.out.println("Enter the matrix of the element. ");
        for (int i=0; i<rows; i++){
            for (int j=0 ; j<columns; j++){
                matrix[i][j]=input.nextInt();
            }
        }
        System.out.println("\nMatrix number. ");
        for (int i= 0; i<rows; i++){
            for (int j=0 ; j<columns; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum=0;
        for (int[] row: matrix){
            for (int value: row){
                sum+=value;
            }
        }
        System.out.println("\nSum of array: " + sum);
    }
}