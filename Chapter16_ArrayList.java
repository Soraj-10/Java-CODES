
// Chapter16_ArrayList.java
import java.util.ArrayList;

public class Chapter16_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}