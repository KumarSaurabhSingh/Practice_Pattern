import java.util.Scanner;

public class pattern2 {

    static void pattern2(int N){

        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args){

        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Triangle size");
        N = input.nextInt();
        pattern2(N);
    }
}