import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



    public class ConcurrentModificationExceptionExample {

        public static void main(String[] args) {

            Map<String, Long> phoneBook = new HashMap<String, Long>();

            phoneBook.put("Vikram",8149101254L);
            phoneBook.put("Mike",9020341211L);
            phoneBook.put("Jim",7788111284L);
            System.out.println(phoneBook);

            Iterator<String> keyIterator = phoneBook.keySet().iterator();//3 elements

            while (keyIterator.hasNext()){
                String key = keyIterator.next();
                System.out.println("key = "+ key);
                if ("Vikram".equals(key)){
                    keyIterator.remove();//this works and removes ele from map
//                phoneBook.remove("Jim");//remove element from map is not allowed
//                phoneBook.put("Bob",121212121L);
                }
            }
            System.out.println(phoneBook);
        }
    }

