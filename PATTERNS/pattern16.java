import java.util.Scanner;

public class pattern16 {
    

    static void pattern16(int N){

        char ch = 'A';

        for (int i=0; i<N; i++){

            for(int j=0; j<=i; j++){
                System.out.print(ch);
            }

            ch++;

            System.out.println();
        }
    }


    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern16(N);
    }
}
