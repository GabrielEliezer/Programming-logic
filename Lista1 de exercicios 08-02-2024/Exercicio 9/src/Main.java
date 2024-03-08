import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe seu valor em Km: ");
        Scanner in = new Scanner(System.in);

        double valorkm, resultado;

        valorkm = in.nextDouble();

        resultado = valorkm * 0.621371;

        System.out.println("Seu valor em Milhas é: " + resultado);

    }
}