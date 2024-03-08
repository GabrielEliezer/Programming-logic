import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe Seu valor em Milimetros: ");

        Scanner scan_1 = new Scanner(System.in);

        double mm, respol;

        mm = scan_1.nextDouble();

        respol = mm/25.4;

        System.out.println("Seu valor em Polegada é: " + respol);

    }
}