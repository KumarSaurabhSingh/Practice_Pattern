import java.util.ArrayDeque;
import java.util.Queue;

public class arrayDeque {

    static void arrayDeque(){

        ArrayDeque<Integer> ArrDeq = new ArrayDeque<>();

        ArrDeq.offer(23);
        ArrDeq.offerFirst(34);
        ArrDeq.offerLast(39);
        ArrDeq.offer(100);

        System.out.println(ArrDeq); //prinitng the array deque

        System.out.println("Poll last: " +ArrDeq.pollLast());
        System.out.println(ArrDeq);


        System.out.println("Peek ArrayDeque: " +ArrDeq.peek());
        System.out.println(ArrDeq);


        System.out.println("Peek last:  " +ArrDeq.peekLast());
        System.out.println(ArrDeq);



    }
    

    public static void main(String[] args){
        arrayDeque();
    }
}




