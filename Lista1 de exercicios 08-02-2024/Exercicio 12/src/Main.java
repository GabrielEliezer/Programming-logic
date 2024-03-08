import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe sua Nota 1: ");

        double n1, n2, resultado;

        Scanner n1a = new Scanner(System.in);
                n1 = n1a.nextDouble();


        System.out.println("Informe sua Nota 2: ");

        Scanner n2a = new Scanner(System.in);
        n2 = n2a.nextDouble();

        n2= n2*2;

        resultado = ((n1 + n2) / 2 );

        if (resultado > 10) {
            resultado = 10;
        }
        System.out.println("Sua nota é: " + resultado);

    }
}