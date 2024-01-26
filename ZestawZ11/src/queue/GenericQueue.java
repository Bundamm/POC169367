package queue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;


public class GenericQueue<T> {
    LinkedList<T> queue = new LinkedList<>();
    Queue<T> queue2 = new LinkedList<>();

    public void enqueue(T element){
        queue2.add(element);
    }
    public T dequeue(){
        if(queue2.isEmpty()){
            throw new IllegalArgumentException("Kolejka jest pusta.");
        }
        return queue2.remove();
    }
}
