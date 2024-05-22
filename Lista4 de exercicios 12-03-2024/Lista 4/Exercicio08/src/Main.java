public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{3, 1, 3},
                {2, 4, 1},
                {1, 2, 2}};

        diag_principal(matriz);
    }

    static void diag_principal(int[][] m) {
        if (m.length == m[0].length) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (i == j)
                        System.out.print(m[i][j] + ", ");
                }
            }
        } else {
            System.out.println("A matriz não é quadrada!");
        }
    }
}