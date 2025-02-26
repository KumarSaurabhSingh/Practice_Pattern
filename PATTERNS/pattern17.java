import java.util.Scanner;

public class pattern17 {


    static void pattern17(int N){

        
        for(int i=0; i<=N; i++){

            //Spaces
            for(int j=(N-i); j>=1; j--){

                System.out.print(" ");
                
            }


            //Characters
            char ch = 'A';

            int breakpoint = (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);

                if(j<= breakpoint) ch++;
                else ch--;
            }

            System.out.println();
        }
    }

     public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern17(N);
    }
    
}
