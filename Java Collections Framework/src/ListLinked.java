import java.util.LinkedList;
public class ListLinked {
    //(ii) LinkedList Interface
    public static void main(String[] args){
        LinkedList<Integer> number=new LinkedList<>();
        number.add(25);
        number.addFirst(30);
        number.addLast(45);
        System.out.println(number);
        System.out.println(number.get(0));
    }
}
