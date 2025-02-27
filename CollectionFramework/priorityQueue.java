import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

    static void priorityQueue(){

        //Min heap concept -> The minimum will be at the top of the list 
        Queue<Integer> PQ = new PriorityQueue<>();

        //Adding elements in the Queue
        PQ.offer(89);
        PQ.offer(123);
        PQ.offer(91);
        PQ.offer(2);
        PQ.offer(34);

        System.out.println(PQ); // Printing complete Queue

        //Removing the element from the list-> The top will be the minimum one
        System.out.println("The Poped element is: " + PQ.poll());
        System.out.println(PQ);


        //Checking the next poping element
        System.out.println(PQ.peek());

    }


    static void priorityQueueMax(){

        //Max heap concept -> The maximum will be at the top of the list
        Queue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());

        //Comparator.reverseOrder() -> This will reverse the order of the Heap and make the largest one most priority

        //Adding elements in the Queue
        PQ.offer(89);
        PQ.offer(123);
        PQ.offer(91);
        PQ.offer(2);
        PQ.offer(34);

        System.out.println(PQ); // Printing complete Queue

        //Removing the element from the list-> The top will be the minimum one
        System.out.println("The poped element is: " + PQ.poll());
        System.out.println(PQ);


        //Checking the next poping element
        System.out.println(PQ.peek());

    }


    public static void main(String[] args){

        priorityQueueMax();


    }
    
}
