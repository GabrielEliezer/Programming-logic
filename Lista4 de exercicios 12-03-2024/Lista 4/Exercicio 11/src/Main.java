import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de Linhas da Matriz A: ");
        int linA = sc.nextInt();
        System.out.print("\nInforme a quantidade de Colunas da Matriz A: ");
        int colA = sc.nextInt();

        System.out.print("Informe a quantidade de Linhas da Matriz B: ");
        int linB = sc.nextInt();
        System.out.print("\n Informe a quantidade de Colunas da Matriz B: ");
        int colB = sc.nextInt();

        // Verifica se a multiplicação é possível
        if (colA != linB) {
            System.out.println("O Número de linhas da matriz 1 deve ser igual ao numero de colunas da matriz 2");
            return;
        }

        int[][] matA = new int[linA][colA];
        int[][] matB = new int[linB][colB];
        int[][] matProd = new int[linA][colB];

        // Entrada dos elementos da matriz A
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linA; i++) {
            for (int j = 0; j < colA; j++) {
                matA[i][j] = sc.nextInt();
            }
        }

        // Entrada dos elementos da matriz B
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < linB; i++) {
            for (int j = 0; j < colB; j++) {
                matB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    matProd[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }

        // Imprime o resultado
        System.out.println("Produto das Matrizes: ");
        for (int i = 0; i < linA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(matProd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
