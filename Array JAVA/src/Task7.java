import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    //Task 07: Online Order Story
    //	Use ArrayList<Integer>
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> ordes= new ArrayList<>();
        System.out.println("Order IDs: ");
        ordes.add(101);
        ordes.add(102);
        ordes.add(1020);
        ordes.add(1030);
        ordes.add(1025);
        for (int ids: ordes){
            System.out.println(ids);
        }
        //Order ID to search
        System.out.print("Enter Order ID to search: ");
        int searchId=input.nextInt();
        boolean found= false;
        for (int ids: ordes){
            if (ids==searchId){
                found= true;
                break;
            }
        }
        if (found){
            System.out.println("Order ID found in the system. " + searchId);
        }else {
            System.out.println("Order ID not found in the system. " + searchId);
        }
    }
}
