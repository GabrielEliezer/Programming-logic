import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int maior, menor, n;
        maior = 0;
        menor = 0;

        Scanner in = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Digite n"+(i+1)+":");
            n = in.nextInt();
            if(i==0){
                maior = n;
                menor = n;
            }else {
                if (n > maior)
                    maior = n;
                if (n < menor)
                    menor = n;
            }
        }
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
    }
    }