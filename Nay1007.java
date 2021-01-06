import java.util.Scanner;

public class Nay1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a,b,c,d,x;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        
        //processamento
        x = a*b - c*d;

        //saida
        System.out.println("DIFERENCA = " + x);

    }
}    


