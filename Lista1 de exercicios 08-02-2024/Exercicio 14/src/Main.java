import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Informe a Base do Triângulo: ");

        Scanner base = new Scanner(System.in);

        double basea, alta, result;

        basea = base.nextDouble();


        System.out.print("Informe a Altura do Triangulo: ");
        Scanner altura = new Scanner(System.in);


        alta = altura.nextDouble();

        result = ((basea * alta) / 2);

        System.out.print("A Área do seu Triângulo é: " + result);

    }
}