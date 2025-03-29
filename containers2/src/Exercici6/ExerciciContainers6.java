import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ExerciciContainers6 {
    public static void main(String[] args) {


        List il = new IntList(new int[]{1,2,3});
        il.add(10);
        il.get(1);
        il.size();
        il.contains(2);
        il.subList(1, 2);
        il.remove(2);
        il.toArray();

// Comprova que el mètode «size()» funciona

// Comprova que es poden treure elements amb «get()»

// Què passa si intento afegir elements (il.add(10))?

// Recórre la llista amb un Iterador

// Comprova si funciona el mètode «contains()»
// Comprova si funciona el mètode «sublist()»
// Comprova si funciona el mètode «remove()»
// Converteix la llista a un Array d'Objects i imprimeix-la
    }
}


class IntList extends AbstractList {
    Integer[] data;
    IntList(int[] data) {

        this.data = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            this.data[i] = data[i];
        }
    }

    public IntList(Integer[] subData) {
        this.data = subData;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }
    @Override
    public int size() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        return data.length;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == o) {
                return true;
            }
        }
        return false;
    }

    public List subList(int fromIndex, int toIndex) {
        Integer[] subData = new Integer[toIndex - fromIndex];
        for (int i = fromIndex; i < toIndex; i++) {
            subData[i - fromIndex] = data[i];
        }
        return new IntList(subData);
    }


    @Override
    public Object remove(int index) {
        Integer[] newData = new Integer[data.length - 1];
        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        for (int i = index + 1; i < data.length; i++) {
            newData[i - 1] = data[i];
        }
        data = newData;
        return null;
    }



    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return super.addAll(index, c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return super.toArray(a);
    }

    @Override
    public Iterator iterator() {
        return super.iterator();
    }

    @Override
    public Object[] toArray() {
        return super.toArray();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

}