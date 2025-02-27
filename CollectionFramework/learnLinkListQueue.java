//A Queue Data Structure is a fundamental concept in computer science used for storing and managing data in a specific order. 
//It follows the principle of "First in, First out" (FIFO), where the first element added to the queue is the first one to be removed.

import java.util.LinkedList;
import java.util.Queue;

public class learnLinkListQueue {

    static void linkListQueue(){

        Queue<Integer> queue = new LinkedList<>(); //Implemented Queue using Linklist
        queue.offer(12); //If not added successfully it will return true or false
        queue.add(24);  // if not added successfully it will throw an exceptional error.
        queue.offer(29);
        queue.add(76);

        System.out.println(queue); // Print complete Queue

        //Removing the first added element
        System.out.println(queue.poll()); //return null if no element is present
        //queue.remove() -> we can use this as well but will throw exception if its empty queue

        System.out.println("Next queue going to be removed:  " +queue.peek()); // only throw null if no element is in the list
        //queue.element() -> can use this but will throw error if no queue is in the list
        
        System.out.println(queue);

    }

    public static void main(String[] args){

        linkListQueue();
    }
    
}
