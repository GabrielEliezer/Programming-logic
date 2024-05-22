public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 1},
                {3, 2, 2},
                {1, 1, 3}
        };

        int determinante = calcularDeterminante(matriz);
        System.out.println("Determinante: " + determinante);
    }

    private static int calcularDeterminante(int[][] matriz) {
        int determinante = 0;


        for (int deslocamento = 0; deslocamento < matriz.length; deslocamento++) {
            int produtoPrincipal = 1;
            int produtoSecundario = 1;

            for (int linha = 0; linha < matriz.length; linha++) {
                produtoPrincipal *= matriz[linha][(linha + deslocamento) % matriz.length];
                produtoSecundario *= matriz[linha][(matriz.length - 1 - linha + deslocamento) % matriz.length];
            }

            determinante += produtoPrincipal - produtoSecundario;
        }

        return determinante;
    }
}
