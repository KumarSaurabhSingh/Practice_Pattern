import java.util.Scanner;

public class pattern22 {
    

    static void pattern22(int N){

        for(int i=1; i<=2*N-1; i++){


            // inner loop for no. of columns.
            for(int j=0;j<2*N-1;j++){

                int top = i;
                int bottom = j;
                int left = (2*N-2) - i;
                int right = (2*N-2) - j;


                System.out.print(N- Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
        
            }
        
            System.out.println();
        }

        
    }



    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern22(N);
    }
}
