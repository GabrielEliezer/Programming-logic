import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe seu valor em Graus Celsius para ser Convertido em Fahreinheit: ");
        double varcels, result;

        Scanner asp = new Scanner(System.in);

        varcels = asp.nextDouble();

        result= ((varcels*1.8) + 32);

        System.out.println("Seu valor em Fahrenheit é: " + result);

    }
}