import java.util.Scanner;

public class pattern20 {

    static void pattern20(int N){

        for(int i=0; i<N; i++){

            //first triangle
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            //Inverted spaces
            for(int j=2*N-2*i; j>2; j--){
                System.out.print(" ");
            }

            //Second trinagle
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }


            System.out.println();
        }

        for(int i=1; i<N; i++){
            //first inverted triangle
            for(int j=N-i; j>0; j--){
                System.out.print("*");
            }


            //Inverted spaces
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }

            //second triangle
            for(int j=N-i; j>0; j--){
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
        pattern20(N);
    }
}
