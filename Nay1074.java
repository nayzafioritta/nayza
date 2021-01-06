import java.util.Scanner;

public class Nay1074{
    public static void main(String args[]){
        Scanner teclado =  new Scanner(System.in);
        
        int N, X;
        N = teclado.nextInt();

       for (int i=0; i<N; i++) {
            X = teclado.nextInt();
            if (X == 0) {
                System.out.println("NULL");
            }
            else {
            if (X % 2 == 0) {
                System.out.print("EVEN ");
            }
            else {
                System.out.print("ODD ");
            }
            if (X > 0) {
                System.out.println("POSITIVE");
            }
            else {
                System.out.println("NEGATIVE");
            }}
        }
    }
}   

//OK

