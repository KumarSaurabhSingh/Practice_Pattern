import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Concepts of collections and compare collections 

public class collectionClass {
    
    static void collectionClass(){

        List<Integer> nList = new ArrayList<>();
        nList.add(23);
        nList.add(3);
        nList.add(12);
        nList.add(33);
        nList.add(89);
        nList.add(999);
        nList.add(10);
        nList.add(2);

        System.out.println(nList);

        System.out.println("Min value : "+ Collections.min(nList));

        System.out.println("Max Value : " +Collections.max(nList));

        Collections.sort(nList, Comparator.reverseOrder());
        System.out.println(nList);


    }


    static void compareCollection(){

        List<student> newList = new ArrayList<>();
        newList.add(new student("Anuj", 1));
        newList.add(new student("rahul", 2));
        newList.add(new student("mohit", 12));
        newList.add(new student("sakshi", 34));
        newList.add(new student("pandey", 10));

        // Collections.sort(newList);
        // System.out.println(newList);


        Collections.sort(newList, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.name.compareTo(o2.name);
            }
        });      // The above comparator will comapre the list on the basis pf name

        System.out.println(newList);
    }


    public static void main(String[] args){
        compareCollection();
    }
}
