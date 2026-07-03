import java.util.HashSet;
import java.util.Scanner;
public class MysteriousNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int n = input.nextInt();
        if (n < 1 || n > 1000) {
            System.out.println("Number out of range: ");
            input.close();
            return;
        }
        HashSet<Integer> visited = new HashSet<>();
        int steps = 0;
        int current = n;
        while (current != 1) {
            if (visited.contains(current)) {
                System.out.println("Infinite loop detected. ");
                break;
            }
            visited.add(current);
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = 3 * current + 1;
            }
            steps++;
        }
        if (current == 1) {
            System.out.println(steps);
        }
        input.close();
    }
}
