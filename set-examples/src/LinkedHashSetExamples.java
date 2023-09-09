import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExamples {
    public static void main(String[] args) {
        Set<String> fruitNames = new LinkedHashSet<>();
        fruitNames.add("Apple");
        fruitNames.add("Banana");
        fruitNames.add("Mango");
        fruitNames.add("Watermelon");
        System.out.println("------------");
        System.out.println("isEmpty set" + fruitNames.isEmpty());
        System.out.println("---------------");
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
        System.out.println("-----------------------");
    }
}


