import java.util.ArrayList;
public class Task6 {
    //Task 06: Text Comments Storage
    //A feedback system stores user comments dynamically.
    //	Use ArrayList<String>
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        System.out.println("User Comments: ");
        list.add("Great service!");
        list.add("Fast delivery.");
        list.add("Good quality products.");
        list.add("Good quality price");
        int size=list.toArray().length;
        for (String comments: list){
            System.out.println(comments);
        }
        System.out.println("Total number of comments: " + size);
    }
}
