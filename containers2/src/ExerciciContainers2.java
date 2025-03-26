import java.util.PriorityQueue;
import java.util.Queue;

public class ExerciciContainers2 {
    public static void main(String[] args) {

        Queue<Car> pq = new PriorityQueue<Car>();
        pq.offer(new Car("Renault", 15));
        pq.offer(new Car("Fiat", 5));
        pq.offer(new Car("Mercedes",25));
        pq.offer(new Car("Volkswagen", 20));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}



class Car implements Comparable<Car> {
    String marca;
    int puntuacion;

    public Car(String marca, int puntuacion) {
        this.marca = marca;
        this.puntuacion = puntuacion;
    }

    @Override
    public int compareTo(Car o) {
        if (o.puntuacion == this.puntuacion) {
            return 0;
        } else if (o.puntuacion < this.puntuacion) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
