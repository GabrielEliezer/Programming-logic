import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, insira um número inteiro: ");
        numero = leitor.nextInt();

        System.out.println(calcularSomaRecursiva(numero));
    }

    static int calcularSomaRecursiva(int valor) {
        if (valor <= 0)
            return 0;
        else {
            return valor + calcularSomaRecursiva(valor - 1);
        }
    }
}
