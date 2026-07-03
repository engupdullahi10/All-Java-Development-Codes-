import java.util.Scanner;
public class Question2 {
    public static int printSquares(int n){
        System.out.println("Squares Series:");
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int sq = i * i;
            sum += sq;
            System.out.print(sq + " ");
        }
        System.out.println();
        return sum;
    }
    public static int printCubes(int n){
        System.out.println("Cubes Series:");
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int cube = i * i * i;
            sum += cube;
            System.out.print(cube + " ");
        }
        System.out.println();
        return sum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (n <= 15): ");
        int n = input.nextInt();

        int squareSum = printSquares(n);
        int cubeSum = printCubes(n);

        System.out.println("Sum of Squares: " + squareSum);
        System.out.println("Sum of Cubes: " + cubeSum);
    }
}
