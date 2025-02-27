import java.util.HashSet;
import java.util.Set;

public class customSet {

    static void hashCustom(){

        Set<student> std = new HashSet<>();

        std.add(new student("Anuj", 23));
        std.add(new student("Harry", 19));
        std.add(new student("mark", 17));
        
        std.add(new student("Jenny", 17));

        System.out.println(std);

    }

    

    public static void main(String[] args){

        hashCustom();

    }
    
}


