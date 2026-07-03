import java.util.HashSet;
public class HashSetExample {
    // Interface
    // Ste Interface
    //(i) HashSet Interface
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(20);
        set.add(40);
        set.add(25);
        set.add(20); //duplicate ignored
        System.out.println(set);
    }
}
