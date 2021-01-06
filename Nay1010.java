import java.util.Scanner;

public class Nay1010{
    public static void main(String args[]){
        Scanner teclado  = new Scanner(System.in);

        int cod1, cod2, qtde1, qtde2;
        float valor1, valor2, total;

        //entrada

        cod1 = teclado.nextInt();
        qtde1 = teclado.nextInt();
        valor1 = teclado.nextFloat();
        cod2 = teclado.nextInt();
        qtde2 = teclado.nextInt();
        valor2 = teclado.nextFloat();

        //processamento
        total = ((qtde1 * valor1) + (qtde2 * valor2));
        
        //saida
        System.out.printf("VALOR A PAGAR: R$ %.2f&n",total);
    }
}    
