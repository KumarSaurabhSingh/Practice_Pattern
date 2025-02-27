import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnSet {

    static void leaningSet(){

        //Set<Integer> newSet = new HashSet<>(); //set doesn't allow duplicate value + Time complexity -> big O(1)
        //Set<Integer> newSet = new LinkedHashSet<>(); //This will maintain the order plus integrate the property of linklist 


        Set<Integer> newSet = new  TreeSet<>(); //-> Time Complexity -> Big O(Logn)
        //We can also use Comparator.reverseOrder() to reverse the order

        newSet.add(32);
        newSet.add(43);
        newSet.add(102);
        newSet.add(30);
        newSet.add(78);

        System.out.println(newSet);

        System.out.println("Value Removed : " +newSet.remove(30));

        System.out.println(newSet);

        System.out.println("Value present : " + newSet.contains(78));


        newSet.clear();
        System.out.println(newSet);
    } 


    public static void main(String[] args){
        leaningSet();
        
    }
    
}
