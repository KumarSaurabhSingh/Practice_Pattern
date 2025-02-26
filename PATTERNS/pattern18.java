import java.util.Scanner;

public class pattern18 {
    
    static void pattern18(int N){

        for(int i=0; i<N; i++){

            // Inner loop for printing the alphabets from
          // A + N -1 -i (i is row no.) to A + N -1 ( E in this case).
        for(char ch =(char)(int)('A'+N-1-i);ch<=(char)(int)('A'+N-1);ch++){
            
            System.out.print(ch + " ");
        }

            System.out.println();
        }
    }

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern18(N);
    }
}
