import java.util.Set;
import java.util.TreeSet;
// Element are stored in sorted order
public class TreeSetExamples {
    public static void main(String[] args) {
        Set<String> fruitNames = new TreeSet<>();

        fruitNames.add("Mango");
        fruitNames.add("Apple");
        fruitNames.add("Guava");
        fruitNames.add("Orange");

        System.out.println("-----------------------");
        System.out.println("isEmpty set ? "+fruitNames.isEmpty());
        System.out.println("-----------------------");
        System.out.println("size : "+fruitNames.size());
        System.out.println("-----------------------");
        for (String fruitName : fruitNames){
            System.out.println("Name : "+ fruitName );
        }
        System.out.println("-----------------------");
        fruitNames.remove("Apple");

        for (String fruitName : fruitNames){
            System.out.println("Name : "+ fruitName );
        }
        System.out.println("-----------------------");
        System.out.println("size : "+fruitNames.size());
        System.out.println("------------------");
    }
}
