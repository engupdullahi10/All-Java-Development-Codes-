import java.util.Scanner;
public class AlphabeticalSort {
    public static void main(String[] args){
        //AlphabeticalSort
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        String[] name=new String[n];
        //Read name:
        for (int i=0; i<n;i++){
            System.out.println("Enter name " + (i + 1) + " :");
            name[i]=input.nextLine();
        }
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1 - i ;j++){
                if (name[j].charAt(0) > name[j + 1].charAt(0)){
                    String temp= name[j];
                    name[j]= name[j + 1];
                    name[j + 1]= temp;
                }
            }
        }
        System.out.println("Alphabetical Order: ");
        for (int i=0 ; i<n; i++){
            System.out.println(name[i]);
        }
    }
}
