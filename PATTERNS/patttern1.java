import java.net.SocketPermission;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class patttern1 {
    static void pattern1(int N){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] arg){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Please eneter the count: ");
        N = input.nextInt();
        pattern1(N);
        input.close();
    }
}

