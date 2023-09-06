
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapJavaExample {

    public static void main(String[] args) {
        Map<String, Long> myPhoneBook = new HashMap<>();

        myPhoneBook.put("Ranjit", 1234123412L);//insert and update

        myPhoneBook.put("Komal",2345234523L);
        myPhoneBook.put("Komal",1212121212L);


        myPhoneBook.put("Omkar",3456345634L);
        myPhoneBook.put(null, null);
        myPhoneBook.put("xyz", null);

        myPhoneBook.remove(null);

        System.out.println(myPhoneBook);
        System.out.println("--------keys---------");
        for (String key : myPhoneBook.keySet()){
            System.out.println("key = "+ key);
        }
        System.out.println("--------values--------");

        for (Long value : myPhoneBook.values()){
            System.out.println("R = "+ value);
        }
        System.out.println("-------Entries----------");

        for (Map.Entry<String, Long> entry : myPhoneBook.entrySet()){
            System.out.println("K = " + entry.getKey() + " R = " + entry.getValue());
        }
        System.out.println("---------------------");

        Iterator<String> iterator = myPhoneBook.keySet().iterator();
        //iterator is a pointer that will iterate over set elements.

        System.out.println("---------Iterator----------");

        while (iterator.hasNext()){
            System.out.println("key = "+iterator.next());
        }
    }
}
