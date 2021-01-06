import java.util.Scanner;

public class Nay1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int COD, QNT;

        double total;

        COD = teclado.nextInt(); //codigo do produto
        QNT = teclado.nextInt(); //quantidade

        //processamento

        if (COD == 1){
            total = QNT * 4.00;
        }
        else if (COD == 2){
            total = QNT * 4.50;
        }
        else if (COD == 3){
         total = QNT * 5.00;
        }
        else if (COD == 4){
            total = QNT * 2.00;
        }   
        else{
            total = QNT * 1.50;
        }
        
        //saida

        System.out.println ("Total : R$ %.2f\n", total);
        
    }
}