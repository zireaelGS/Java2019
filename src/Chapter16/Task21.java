package Chapter16;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task21 {
    public static void main(String[] args) {

        //создаем объект компоратор, который будет сравнивать введенные нами значения по убыванию
        Comparator<Double> comparator = Comparator.reverseOrder();
        //создаем коллекцию очереди с приоритетной сортировкой,используя компоратор заданный выше
        Queue<Double> queue = new PriorityQueue<>(comparator);
        //добавляем туда элементы
        queue.add(3.2);
        queue.add(9.8);
        queue.add(5.4);

        System.out.print("Polling from queue: ");

        // display elements in queue
        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek()); // view top element
            queue.poll(); // remove top element
        }
    }
}



