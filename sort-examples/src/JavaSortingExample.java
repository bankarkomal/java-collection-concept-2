import jdk.jfr.Name;

import java.util.*;
import java.util.jar.Attributes;

public class JavaSortingExample {
    public static void main(String[] args) {
        String[] fruitNames = new String[5];

        fruitNames[0] = "Apple";
        fruitNames[1] = "Mango";
        fruitNames[2] = "Grapes";
        fruitNames[3] = "Banana";
        fruitNames[4] = "Watermelon";

        System.out.println(" Element of array w/o sorting --");
        for (String name : fruitNames) {
            System.out.println(name);
        }
        System.out.println("Elements of array after sorting--");
        Arrays.sort(fruitNames);
        for (String name : fruitNames) {
            System.out.println(name);
        }
        List<String> guestList = new ArrayList<>();

        guestList.add("Ranjit");
         guestList.add("Komal");
         guestList.add("Omakar");
         guestList.add("Ajit");
         guestList.add("Nilam");

        System.out.println("Element of array w/o sorting");
        guestList.forEach(System.out::println);
        Collections.sort(guestList);

        System.out.println("Elements  of array after sorting");
        guestList.forEach(System.out::println);

            
        }

    }

