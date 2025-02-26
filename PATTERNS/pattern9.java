import java.util.Scanner;

public class pattern9 {

    static void pattern9(int N){

        // Upper Triangle

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


        // Inverted Triangle
        for(int i=0; i<N; i++){

            //Spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }


            //Stars
            for(int k=2*N-2*i; k>1; k--){
                System.out.print("*");
            }

            System.out.println();
        }

    }
    

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest me a number: ");
        N = input.nextInt();
        pattern9(N);
    }
}
