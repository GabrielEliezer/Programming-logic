import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int numero, resultado;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular o fatorial: ");
        numero = leitor.nextInt();
        resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    static int calcularFatorial(int valor) {
        int fatorial = 1;
        for (int indice = 1; indice <= valor; indice++) {
            fatorial *= indice;
        }
        return fatorial;
    }
}
