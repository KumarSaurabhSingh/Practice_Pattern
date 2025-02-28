import java.util.Scanner;

public class pattern4 {

    public static void pattern4(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        N = input.nextInt();
        pattern4(N);
        input.close();
    }
    
}
