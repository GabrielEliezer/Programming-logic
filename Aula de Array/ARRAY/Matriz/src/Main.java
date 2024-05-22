public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Percorre cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Percorre cada coluna da matriz
            for (int j = 0; j < matriz[i].length; j++) {
                // Imprime o elemento da linha i e coluna j
                System.out.print(matriz[i][j] + " ");
            }
            // Quebra de linha após cada linha da matriz
            System.out.println();
        }
    }
}
