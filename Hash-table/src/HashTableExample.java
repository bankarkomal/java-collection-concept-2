import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("Ajit",1);
        hashtable.put("Nilam",2);
        hashtable.put("Komal",3);
        // hashtable.put(null,4);
        System.out.println("value assigned komal is :" + hashtable.get("komal"));
        hashtable.forEach((t,u) -> System.out.println(t + " "+u));

        hashtable.remove("Nilam");

        System.out.println("After removing an element");
        hashtable.forEach((t,u) -> System.out.println(t + " "+u));


    }
}
