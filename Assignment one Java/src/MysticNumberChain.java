import java.util.HashSet;
import java.util.Scanner;
public class MysticNumberChain {
    public static int sumOfSquares(int n){
        int sum=0;
        while (n > 0){
            int digit=n % 10;
            sum+=digit * digit;
            n /= 10;
        }
        return  sum;
    }
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=input.nextInt();
        HashSet<Integer> seen=new HashSet<>();
        int steps= 0;
        while (n != 1 && !seen.contains(n)){
            seen.add(n);
            n=sumOfSquares(n);
            steps++;
        }
        if (n==1){
            System.out.println("Mystic is: " + steps + " Steps ");
        }else {
            System.out.println("Cursed is: " + steps + " Steps ");
        }
    }
}
