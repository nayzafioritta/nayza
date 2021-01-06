import java.util.Scanner;

public class Nay1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, mF, hF, durI, durF, durT, horT, minT;

        //entrada

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // passo 1 - converter para minutos
        durI = hI * 60 + mI;
        durF = hF * 60 + mF;

        //passo 2 - subtrair o fim do inicio
        durT = durF - durI;
        if (durT <= 0){ 
            durT = durT + 24*60;

        }
        
        //passo 3 - converter este tempo de volta para horas

        horT = durT / 60;
        minT = durT % 60;

        System.out.println("O JOGO DUROU " + horT + " HORA(S) E " + minT + " MINUTO(S)");


    }
}


