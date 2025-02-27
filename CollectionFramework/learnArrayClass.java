import java.util.Arrays;

public class learnArrayClass {

    static void arrayClass(){

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //int index = Arrays.binarySearch(numbers, 4);
        //System.out.println("The index of searched element is : " + index);


        Arrays.sort(numbers);
        
        for(int i : numbers){
            System.out.print(i);
        }
    }


    public static void main(String[] args){
        arrayClass();
    }
}
