import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();
        if (numero > 0) {
            int resultado = calcularSoma(numero);
            System.out.println("Soma: " + resultado);
        }
    }

    static int calcularSoma(int valor) {
        int total = 0;
        for (int indice = 1; indice <= valor; indice++) {
            total += indice;
        }
        return total;
    }
}
