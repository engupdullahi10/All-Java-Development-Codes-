import java.util.HashSet;
import java.util.Scanner;
public class MysticNumberChain {
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        HashSet<Integer> visited = new HashSet<>();
        int steps = 0;
        int current = n;
        while (current != 1 && !visited.contains(current)) {
            visited.add(current);
            current = sumOfSquares(current);
            steps++;
        }
        if (current == 1) {
            System.out.println("Mystic in " + steps + " steps");
        } else {
            System.out.println("Cursed in " + steps + " steps");
        }
        input.close();
    }
}
