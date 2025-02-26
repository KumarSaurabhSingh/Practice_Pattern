import java.util.Scanner;

public class pattern10 {
    
    static void pattern10(int N){

        for(int i=1; i<=2*N-1; i++){

            int stars = i;

            if( i>N){ 
                stars = 2*N-i;
            }


            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            
            

            System.out.println();
        }



        // for(int i=1; i<N; i++){
        //     for(int j=N-i; j>0; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    }

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest me a number: ");
        N = input.nextInt();
        pattern10(N);
    }
}
