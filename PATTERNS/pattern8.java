import java.util.Scanner;

public class pattern8 {
    
    static void pattern8(int N){

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
        System.out.println("Suggest a number: ");
        N = input.nextInt();
        pattern8(N);
    }
}
