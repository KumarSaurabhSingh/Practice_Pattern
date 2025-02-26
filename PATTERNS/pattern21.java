import java.util.Scanner;

public class pattern21 {


    static void pattern21(int N){

        for(int i=0; i<N; i++){

            if(i==0 || i==N-1){
                for(int j=0; j<N; j++){
                    System.out.print("*");
                }
            }

            else{
                for(int j=0; j<N; j++){
                    if(j==0 || j==N-1){
                        System.out.print("*");
                    }

                    else{
                        System.out.print(" ");
                    }
                }
            }


            System.out.println();
        }
    }



    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Suggest a number");
        N = input.nextInt();
        pattern21(N);
    }
    
}
