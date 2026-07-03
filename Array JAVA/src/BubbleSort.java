import java.util.Arrays;

public class BubbleSort {
    //Bubble Sort
    public static void main(String[] args){
        int[]num={4 , 3 , 2 , 6 , 5 , 1 , 9};
        for (int i=0 ; i<num.length-1;i++){
            for (int j=0 ;j<num.length-1-i; j++){
                if (num[j]>num[j + 1]){
                    int temp=num[j];
                    num[j]=num[j + 1];
                    num[j + 1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
