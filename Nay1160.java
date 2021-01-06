import java.util.Scanner;

public class Nay1143{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int PA,PB;
        double G1, G2;
        int anos;

        PA = teclado.nextInt();
        PB = teclado.nextInt();
        G1 = teclado.nextDouble();
        G2 = teclado.nextDouble();

        anos = 0;

        while (PA <=PB){
            PA = (int)(PA + PA * G1/100);
            PB = (INT)(PB = PB * G2/100);
            anos++

            












    }
}