import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ejemploQueue {
    public static void main(String[] args) {
      /*  Queue<Integer> cua = new LinkedList<>();
        cua.offer(5);
        cua.offer(10);
        cua.offer(15);
        cua.offer(20);

        int elemento = cua.poll();
        System.out.println(elemento);
        System.out.println(cua); */

        PriorityQueue<Integer> cuaPrioritat = new PriorityQueue<>();
        cuaPrioritat.offer(20);
        cuaPrioritat.offer(95);
        cuaPrioritat.offer(19);
        cuaPrioritat.offer(50);

        while (!cuaPrioritat.isEmpty()) {
            System.out.println(cuaPrioritat.poll());
        }


    }
}
