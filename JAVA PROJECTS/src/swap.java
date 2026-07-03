import java.util.Scanner;
class intWrapper{
    public int number;
    public  intWrapper(int val){
        this.number=val;
    }
}
public class swap {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=input.nextInt();
        System.out.println("Enter the second number: ");
        int num2=input.nextInt();
        intWrapper n1= new intWrapper(num1);
        intWrapper n2=new intWrapper(num2);
        System.out.println("Before swap: num1="+num1 + " , num2= " + num2);
        SwapFun(n1 , n2 );
        System.out.println("After  swap num1= " + num1 + " , num2= "+num2);
        System.out.println("Simple OutPut: ");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
    }
    public static void  SwapFun(intWrapper n1  , intWrapper  n2){
        int temp= n1.number;
        n1.number=n2.number;
        n2.number= temp;
        System.out.println("Inside the swap: n1= " + n1 + " ,  n2=" +n2);;

    }

}
