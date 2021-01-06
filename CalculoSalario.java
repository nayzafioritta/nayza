import java.util.Scanner;

public class CalculoSalario{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;

        //entrada

        System.out.print("Digite o salario: ");
        salario = teclado.nextDouble();

        if (salario <= 1000.0){
            imposto = 0.0;

        }
        else{
            if (salario <= 1800.0){
                imposto = salario * 10.0/100;

            }
            else{ 
                if ( salario <= 2500.0){
                    imposto = salario * 15.0/100;

                }
                else{
                    if ( salario <=4000.0){
                        imposto = salario * 20.0/100;

                    }
                    else{
                        imposto = 1300.00;

                    }
        
                }

            }
        }

        System.out.printf("Seu salario base: R$ %.2f\n", salario);
        System.out.printf("Imposto Retido  : R$ %.2f\n", imposto);
        System.out.printf("Salario Liquido : R$ %.2f\n", salario - imposto) ;   
    }
}