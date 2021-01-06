import java.util.Scanner;

public class Nay1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idadeemdias;
        int anos, meses, dias;

        int resto;

        idadeemdias = teclado.nextInt();

        anos  = idadeemdias / 365;

        resto = idadeemdias % 365;

        meses = resto / 30;

        dias  = resto % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        

    }
}