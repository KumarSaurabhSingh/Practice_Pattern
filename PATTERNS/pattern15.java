import java.util.Scanner;

public class pattern15 {
    

    static void pattern15(int N){

        for(int i=0; i<N; i++){

            for(char ch='A'; ch <'A' + N - i; ch++){
                System.out.print(ch);
            }

            System.out.println();
        }
    }


    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern15(N);
    }
}
