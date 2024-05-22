import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        int value;
        boolean not_found = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        value = in.nextInt();

        for(int i=0;i<vector.length;i++){
            if (vector[i]==value){
                System.out.println("Valor " + value + " encontrado na posição " + i);
                not_found = false;
                break;
            }
        }
        if (not_found)
            System.out.println("Valor não encontrado!");
    }
}