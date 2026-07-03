import java.util.ArrayList;
public class MainList {
    //Java Collections Framework
    // Interfaces Java Collections Framework:
    //List Interfaces
    // (i) ArrayList , (ii) LinkedList
    //(i) ARRAYLIST
    public static void main(String[] args){
        ArrayList<String> name= new ArrayList<>();
        name.add("Abdullahi");
        name.add("Zamzam");
        name.add("Yasir");
        name.add("Aisha");
        name.add("Imran");
        name.add("Muaada");
        System.out.println(name);
        System.out.println(name.get(2));
        System.out.println(name.get(4));

    }
}