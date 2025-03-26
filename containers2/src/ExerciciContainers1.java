import java.util.Iterator;

public class ExerciciContainers1 {
    public static void main(String[] args) {

        Sequence sequence = new Sequence();
       /* for(Integer i: sequence) {
            System.out.println(i);
        } */

        Iterator<Integer> it = sequence.iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

    }
}

class Sequence implements Iterable<Integer> {
    private int[] data = {1, 5, 6, 7, -1, 2};
    int posicion = 0;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                if (posicion >= data.length) return false;
                return true;
                }

            @Override
            public Integer next() {
                int temp = data[posicion];
                posicion++;
                return temp;
            }
        };
    }
}
