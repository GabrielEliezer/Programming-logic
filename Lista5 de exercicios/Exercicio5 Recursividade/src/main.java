import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, informe o tamanho do array:");
        int tamanho = entrada.nextInt();
        int[] numeros = new int[tamanho];
        System.out.println("Digite os elementos do array em ordem crescente:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }
        System.out.println("Informe o número que deseja buscar:");
        int numeroBuscado = entrada.nextInt();
        int indiceEncontrado = buscaBinaria(numeros, numeroBuscado, 0, numeros.length - 1);
        if (indiceEncontrado != -1) {
            System.out.println("O número " + numeroBuscado + " está localizado na posição: " + indiceEncontrado);
        } else {
            System.out.println("Número não localizado no array.");
        }
        entrada.close();
    }

    public static int buscaBinaria(int[] array, int alvo, int inicio, int fim) {
        if (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            if (array[meio] == alvo)
                return meio;
            else if (array[meio] < alvo)
                return buscaBinaria(array, alvo, meio + 1, fim);
            else
                return buscaBinaria(array, alvo, inicio, meio - 1);
        }
        return -1;
    }
}