import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe a Velocidade em Km/h:");

        Scanner velocidadekmh = new Scanner(System.in);

        int velocidadeemkmhinteiro, resultado;

        velocidadeemkmhinteiro = velocidadekmh.nextInt();

        resultado = velocidadeemkmhinteiro *1000;

        System.out.println("Seu valor em Metros é:" + resultado + "m/s");

    }
}