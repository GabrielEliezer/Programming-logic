public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{3,1,3,4,5},
                          {2,4,1,6,7},
                          {1,2,2,7,4},
                          {3,5,4,7,8},
                          {7,5,8,9,7}};

        diag_secundaria(matriz);
    }

    static void diag_secundaria(int[][] m) {
        for (int i=0; i<=4; i++)
            System.out.printf(m[i][4-i] + " ");
    }
}