import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aux;
        for (int i=0; i<5; i++) {
            aux = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-1-i] = aux;
            }
        for(int a=0; a<=array.length-1;a++){
            System.out.println(array[a]);
        }
    }
}
