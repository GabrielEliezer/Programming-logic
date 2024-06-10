import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.print("Insira o elemento a ser buscado: ");
        int elemento = scanner.nextInt();

        int indiceResultado = buscaBinaria(numeros, elemento);

        if (indiceResultado != -1) {
            System.out.println("O elemento " + elemento + " foi encontrado na posição: " + indiceResultado);
        } else {
            System.out.println("Elemento não encontrado no array.");
        }

        scanner.close();
    }

    public static int buscaBinaria(int[] array, int alvo) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }
}
