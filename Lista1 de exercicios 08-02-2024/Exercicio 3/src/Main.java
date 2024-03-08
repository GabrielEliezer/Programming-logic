import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe um Valor com Virgula:");

        Scanner pow = new Scanner(System.in);

        double valorcomvirgula, resultado;

        valorcomvirgula = pow.nextDouble();

        resultado = valorcomvirgula/5;

        System.out.println("A quinta parte do valor informado é:" + resultado);

    }
}