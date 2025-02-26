import java.util.Scanner;

public class pattern3 {

    public static void pattern3(int N){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    
    
        public static void main(String[] args){
            int N;
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a Number: ");
            N = input.nextInt();
            pattern3(N);
        input.close();
    }
}