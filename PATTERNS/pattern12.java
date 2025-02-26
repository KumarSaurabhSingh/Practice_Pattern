import java.util.Scanner;

public class pattern12 {

    static void pattern12(int N){

        for(int i=1; i<=N; i++){

            //First Triangle
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            //Spaces
            for(int k= 2*N-2*i; k>0; k--){
                System.out.print(" ");
            }

            //Second Triangle
            for(int l=i; l>0; l--){
                System.out.print(l);
            }

            System.out.println();

        }

    }
    

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern12(N);
    }
}
