import java.util.Scanner;

public class Nay1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int qtPar = 0;
        int qtImp = 0;
        int qtPos = 0;
        int qtNeg = 0;

        int num;

        
        for (int co = 1; co <=5; co++) {
            num = teclado.nextInt();
             if (num % 2 == 0) {
                qtPar++;

            }

            else {
             qtImpar++;
            }

          if (num > 0) {
              qtPos++;
            }

            else if {num < 0) {
             qtNeg++;

            }
        }

        System.out.println(qtPar + " valor(es) par(es)");
        System.out.println(qtImpar + " valore(es) impar(es)");
        System.out.println(qtpos + " valor(es) positivo(s)");
        System.out.println(qtNeg + " valor(es) negativos(s)");
               

    }
}