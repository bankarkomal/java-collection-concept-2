/*
Iterable
|
Collection
|
List
|
ArrayList

 */




import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> guestlist = new ArrayList<>(2);
        //base address + index*size of address stored.
        guestlist.add("Ranjit");
        guestlist.add("Komal");
        guestlist.add("Omkar");
        guestlist.add("Mayur");

        guestlist.forEach(System.out::println);
        System.out.println("----------------");
        guestlist.add(0,"Ajit");

        guestlist.forEach(System.out::println);
        System.out.println("---------------");
        guestlist.add(2,"Nilam");

        guestlist.forEach(System.out::println);
        System.out.println("------------");
        guestlist.remove(0);

        guestlist.forEach(System.out::println);
        System.out.println("-------------");
        guestlist.remove(3);

        guestlist.forEach(System.out::println);
        System.out.println("-------------");

    }
}


