import java.util.Scanner;

public class pattern14 {

    static void pattern14(int N){

        for(int i=0; i<N; i++){
            for(char ch = 'A'; ch<='A'+i; ch++){
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
        pattern14(N);
    }
}
