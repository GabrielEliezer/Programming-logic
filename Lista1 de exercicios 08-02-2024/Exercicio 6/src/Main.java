import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe a velocidade em m/s: ");
        Scanner scan_1 = new Scanner(System.in);

        double ms, resultado;

        ms = scan_1.nextDouble();

        resultado = ms * 3.6;

        System.out.println("Seu valor em Km/h é: " + resultado);

    }
}