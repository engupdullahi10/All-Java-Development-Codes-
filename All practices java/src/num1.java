import java.util.Scanner;
public class num1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int  stratNum=input.nextInt();
        System.out.println("Enter the end number: ");
        int endNum=input.nextInt();
        if (stratNum<=endNum){
            for (int i = endNum; i<= stratNum ; i++) {
                System.out.println(i);
            }

        }else {
            for (int i= stratNum ; i>=endNum; i--){
                System.out.println(i);
            }
        }
        input.close();
    }
}
