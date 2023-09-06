import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationException2Example {
        public static void main(String[] args) {

            Map<String, Long> phoneBook = new ConcurrentHashMap<>();

            phoneBook.put("Ranjit",8149101254L);
            phoneBook.put("Bob",9020341211L);
            phoneBook.put("Johny",7788111284L);
            System.out.println(phoneBook);

            Iterator<String> keyIterator = phoneBook.keySet().iterator();//3 elements

            while (keyIterator.hasNext()){
                String key = keyIterator.next();
                System.out.println("key = "+ key);
                if ("Vikram".equals(key)){
                    keyIterator.remove();//this works and removes ele from map
                    phoneBook.remove("Bob");//remove element from map is not allowed

                }
            }
            System.out.println(phoneBook);
        }
    }

