import java.util.Scanner;

public class Nay1070{
        public static void main(String args[]){
            Scanner teclado =  new Scanner(System.in);

            
         int x = teclado.nextInt();

        if (x % 2 ==0){
            x++;

        }

        for (int cont = 1; cont <=6 ; cont++){
            System.out.println(x) ;
            x = x + 2;


        }    

    }
}

//OK