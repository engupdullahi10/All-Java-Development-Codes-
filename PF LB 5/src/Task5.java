import java.util.Scanner;
public class Task5{
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    static void printPrimes(int limit) {
        for (int i = 2; i <= limit; i++)
            if (isPrime(i)) System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = input.nextInt();
        System.out.println(num + (isPrime(num) ? " is Prime" : " is Not Prime"));

        System.out.print("Enter limit to print all primes: ");
        int limit = input.nextInt();
        System.out.print("Prime numbers up to " + limit + ": ");
        printPrimes(limit);
        input.close();

    }
}
