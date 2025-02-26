import java.util.Scanner;

public class pattern11 {
    
    static void pattern11(int N){
        
        int start = 1;
        for(int i=1; i<=N; i++){
            if(i%2==0) {
                start =0;
            }
            else start=1;

            for(int j=1; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }

    }


    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern11(N);
    }
}
