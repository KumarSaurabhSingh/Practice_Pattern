import java.util.Scanner;

public class pattern13 {

    static void pattern13(int N){

        int count =1;

        for(int i=1; i<=N; i++){

            for(int j=1; j<=i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

    }
    

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern13(N);
    }
}
