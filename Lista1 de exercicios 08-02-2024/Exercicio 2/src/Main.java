import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner under = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor1, resultado;
        valor1 = under.nextInt();

        resultado= valor1/2;

        System.out.println("Seu valor é:" + resultado);

    }
}