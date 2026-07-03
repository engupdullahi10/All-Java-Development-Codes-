import java.util.Scanner;
public class sizeArray {
    int occ=0;
    int []arr;
    public sizeArray(int size){
        arr=new int[size];
    }
    public int[]grow(int[] olArr){
        int[]newArr=new int[olArr.length*2];
        for (int i=0; i<olArr.length; i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
    public void add(int data){
        if (occ==arr.length){
            arr=grow(arr);
        }
        arr[occ]=data;
        occ++;
    }
    public void display(){
        for (int i=0 ; i<occ; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the initial array size: ");
        int size=input.nextInt();
        sizeArray sa=new sizeArray(size);
        System.out.println("How many elements do you want to add: ");
        int number=input.nextInt();
        for (int i=0; i<number; i++){
            System.out.println("Enter element " + ( i + 1) + " : ");
            int value=input.nextInt();
            sa.add(value);
        }
        System.out.println("\nFinal Array Element");
        sa.display();
    }
}
