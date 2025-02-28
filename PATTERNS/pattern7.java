import java.util.Scanner;

public class pattern7 {
    
    static void pattern(int N){
        
        for(int i=1; i<=N; i++){

            //For Spaces
            for(int j=(N-i); j>=1; j--){

                System.out.print(" ");
                
            }

            //For Stars

            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }


    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Please suggest a number");
        N = input.nextInt();
        pattern(N);
    }
}
