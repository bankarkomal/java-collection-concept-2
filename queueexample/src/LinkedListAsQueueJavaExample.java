import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueueJavaExample {
    public static void main(String[] args) {
        Queue<Integer> IntegerQueue = new LinkedList<>();

        IntegerQueue.add(10);
        System.out.println(IntegerQueue);
        IntegerQueue.add(20);
        System.out.println(IntegerQueue);
        IntegerQueue.add(30);
        System.out.println(IntegerQueue);
        IntegerQueue.remove();
        System.out.println(IntegerQueue);
        IntegerQueue.remove();
        System.out.println(IntegerQueue);
    }
}
