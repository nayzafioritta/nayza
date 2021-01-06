import java.util.Scanner;

public class TabuadaDoWhile{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int numero, contador;

        System.out.println("Digite o n para cal a tabuada");
        numero = teclado.nextInt();

        contador = 1;

        do{
            System.out.println(numero = " x " + contador + " = " + (contador * numero));
            contador++;
        } while (contador <= 10);
    }
}