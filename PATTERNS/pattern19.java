import java.util.Scanner;

public class pattern19 {


    static void pattern19(int N){

        for(int i=0; i<N; i++){

            //inverted triangle first
            for(int j=N-i; j>0; j--){
                System.out.print("*");
            }


            //Spaces
            for(int k=0; k<2*i; k++){
                System.out.print(" ");
            }

            //Inverted triangle second
            for(int j=N-i; j>0; j--){
                System.out.print("*");
            }


            System.out.println();
        }

        for(int i=0; i<N; i++){

            //first triangle
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }


            //spaces
            for(int j=2*N-2*i; j>2; j--){
                System.out.print(" ");
            }


            //second triangle
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern19(N);
    }
    
}
