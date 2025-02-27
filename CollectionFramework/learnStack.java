

/*   List -> Stack  */


import java.util.Stack;

public class learnStack {

    static void stackFirst(){

        //Creating Stack with a name Animals

        Stack<String> animals= new Stack<>();
        animals.push("Lion"); // Push adds items in the stack
        animals.push("Tiger");
        animals.push("sloth");
        animals.push("dog");
        animals.push("cat");
        animals.push("mice");

        //This will print the complete stack
        System.out.println("Stack" + animals);

        //Last enered item
        System.out.println(animals.peek());

        //Poping the last entered item. 
        animals.pop();

        System.out.println("Item at the top of the stack:  " +animals.peek());

    }

    public static void main(String[] args){
        stackFirst();
    }
    
}
