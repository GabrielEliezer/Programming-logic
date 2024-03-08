import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe seu valor em Polegada: ");

        double valpol, resultmm;

        Scanner scan_1 = new Scanner(System.in);

        valpol = scan_1.nextDouble();

        resultmm = valpol*25.4;

        System.out.println("Seu valor em Milimetros é: " + resultmm + "'");

    }
}