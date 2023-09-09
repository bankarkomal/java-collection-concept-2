import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<String> fruitNames = new HashSet<>();

        fruitNames.add("Apple");
        fruitNames.add("Banana");
        fruitNames.add("Mango");
        fruitNames.add("Watermelon");
        System.out.println("---------------");
        System.out.println("isEmpty " + fruitNames.isEmpty());
        System.out.println("---------------");
        System.out.println("size :" + fruitNames.size());
        System.out.println("------------------");
        for (String fruitName : fruitNames) {
            System.out.println("Name: " + fruitName);

        }
        System.out.println("---------");
        fruitNames.remove("Mango");
      for (String fruitName : fruitNames){
          System.out.println("Name:" + fruitName);

      }
        System.out.println("-----------");
        fruitNames.forEach(item -> System.out.println("item"));
        System.out.println("-----------------------");
        System.out.println("size : "+fruitNames.size());
        System.out.println("-----------------------");

        {
            
        }
    }
}