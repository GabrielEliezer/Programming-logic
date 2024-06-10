import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, expoente;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número para a base: ");
        base = leitor.nextInt();
        System.out.println("Digite um número para o expoente: ");
        expoente = leitor.nextInt();

        if (expoente >= 0) {
            int resultado = calcularPotencia(base, expoente);
            System.out.println("A potência é: " + resultado);
        } else {
            System.out.println("Valor inválido");
        }
    }

    static int calcularPotencia(int base, int expoente) {
        if (expoente == 0)
            return 1;
        else if (expoente == 1)
            return base;
        else
            return base * calcularPotencia(base, expoente - 1);
    }
}
