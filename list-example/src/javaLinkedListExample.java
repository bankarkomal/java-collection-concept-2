/*
Iterable
|
Collection
|
List
|
LinkedList

 */

import java.util.LinkedList;
import java.util.List;

public class javaLinkedListExample {
    public static <guestlist> void main(String[] args) {
        List<String> guestlist = new LinkedList<>();
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
