import java.util.Scanner;
public class decreaseNum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int startNum=input.nextInt();
        System.out.println("Enter the end number: ");
        int endNum=input.nextInt();
        if (startNum>=endNum) {
            for (int i = startNum; i >= endNum; i--) {
                System.out.println(i);
            }
        } else{
            for (int i = startNum ; i<=endNum ; i++){
                System.out.println(i);
            }
        }
        input.close();
    }
}
