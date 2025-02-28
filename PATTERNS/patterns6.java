import java.util.Scanner;

public class patterns6 {

    static void patterns6(int N){

        for(int i=1; i<=N; i++){
            for(int j=1; j<=(N+1-i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        N = input.nextInt();
        patterns6(N);
        input.close();
    }
}
