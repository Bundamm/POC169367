package queue;

import java.util.LinkedList;

public class GenericQueue<T> {
    LinkedList<T> queue = new LinkedList<>();


    public void enqueue(T element){
        queue.addLast(element);
    }
    public T dequeue(){
        if(queue.isEmpty()){
            throw new IllegalArgumentException("Kolejka jest pusta.");
        }
        return queue.removeFirst();
    }
}
