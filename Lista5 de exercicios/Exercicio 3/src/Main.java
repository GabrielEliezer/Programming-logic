import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int base, expoente, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número para a base: ");
        base = scanner.nextInt();
        System.out.println("Insira um número para o expoente: ");
        expoente = scanner.nextInt();

        if (expoente >= 0) {
            resultado = calcularPotencia(base, expoente);
            System.out.println("A potência é: " + resultado);
        } else {
            System.out.println("Valor inválido");
        }
    }

    static int calcularPotencia(int base, int expoente) {
        int potencia = 1;
        for (int contador = 1; contador <= expoente; contador++) {
            potencia *= base;
        }
        return potencia;
    }
}
