import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número inteiro para calcular o fatorial: ");
        valor = entrada.nextInt();
        System.out.println("O fatorial de " + valor + " é " + calcularFatorial(valor));
    }

    static int calcularFatorial(int numero) {
        if (numero < 0)
            return 0;
        else if (numero == 0)
            return 1;
        else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}
