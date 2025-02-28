import java.util.Scanner;

public class patterns5 {
    static void patterns5(int N){

        for(int i=1; i<=N; i++){
            for(int j=N; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        N = input.nextInt();
        patterns5(N);
        input.close();
    }
}
