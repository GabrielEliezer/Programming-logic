import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menor, meio, maior, aux;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 inteiros");
        menor = in.nextInt();
        meio = in.nextInt();
        maior = in.nextInt();

        if(maior<menor){
            aux = menor;
            menor = maior;
            maior = aux;
        }
        if(maior<meio){
            aux = meio;
            meio = maior;
            maior = aux;
        }
        if(meio<menor){
            aux=menor;
            menor=meio;
            meio=aux;
        }
        System.out.println(menor+" "+ meio +" "+ maior);
    }
}
