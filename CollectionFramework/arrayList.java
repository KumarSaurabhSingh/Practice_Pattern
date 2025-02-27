

/*List ->  1. ArrayList
 *         2. Linked List
 *         3.Stack
 * 
 * 
 * Below has ArrayList and Linked List implementation
 * 
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class arrayList{

    static void arrayListString(){

        //Creating a Array List of size dynamic (At initial it's 10 suppose)
        ArrayList<String> StudenName = new ArrayList<>();

        //Adding an element in Array
        StudenName.add("Lucy Laffer");

        //Once you are done with adding all it will increse the size by
        // new Size N= N+ N/2 +1 = 16 and so om


        StudenName.add("Grabbel horn");
        StudenName.add("Raemen Roulsher");
        System.out.println(StudenName);

        StudenName.add("Stacy swelder");
        System.out.println(StudenName);

        //Adding  a random element at required position
        StudenName.add(2,"Rohan sammy");
        System.out.println(StudenName);

        //Retrieving a random element from the array List
        System.out.println(StudenName.get(4));


    }

    //LinkList in the list-> implemention of list using linklist
    static void linkedListarray(){

        List<String> listing = new LinkedList<>();


        listing.add("Lucy Laffer");
        listing.add("Grabbel horn");
        listing.add("Raemen Roulsher");
        System.out.println(listing);

        //Adding  a random element at required position
        listing.add(2,"Rohan sammy");
        System.out.println(listing);

        System.out.println("Removed item from the list" + listing.remove(0));

        //Retrieving a random element from the array List
        System.out.println(listing.get(2));

    }


    static void arrayListInt(){

        ArrayList<Integer> RollNumber = new ArrayList();

        RollNumber.add(10);
        RollNumber.add(20);
        RollNumber.add(30);
        RollNumber.add(40);
        RollNumber.add(50);
        RollNumber.add(60);
        RollNumber.add(70);
        RollNumber.add(80);

        System.out.println(RollNumber);

        // //The remove operation is happening in Big O(n)
        // int removed = RollNumber.remove(2);
        // System.out.println("Removed element:  " + removed);
        // System.out.println(RollNumber);

        // //The set/Update operation is happening in Big O(1)-> Because it directly updates the position
        // RollNumber.set(1, 9999);
        // System.out.println(RollNumber);

        // //The contain function also has time complexity of Big O(n)
        // System.out.println(RollNumber.contains(9999));


        //Iteration in ArrayList
        for(Integer element: RollNumber){
            System.out.println("The element is:  " + element);
        } // ---> For Each Loop


        //Iterator in build funtion
        Iterator<Integer> Itr = RollNumber.iterator();

        while (Itr.hasNext()) {
            System.out.println("Next Element: " + Itr.next());
        }

    }


    public static void main(String[] args){

        linkedListarray();


    }
}