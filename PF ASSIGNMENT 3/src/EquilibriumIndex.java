import java.util.Scanner;
public class EquilibriumIndex {
    public static void main(String[]args){
        // Equilibrium Index
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int [] number=new int[n];
        int totalSum=0;
        for (int i=0; i<n;i++){
            number[i]=input.nextInt();
            totalSum+=number[i];
        }
        int leftSum=0;
        for (int i=0;i<n;i++){
            int rightSum=totalSum - leftSum -number[i];
            if (leftSum==rightSum){
                System.out.println(i);
                return;
            }
            leftSum+=number[i];
        }
        System.out.println(-1);
    }
}
