import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt();


        System.out.println("Numeros entre " + numero1 + " e " + numero2 + ":");
        if (numero1 <= numero2) {
            for (int i = numero1+1; i < numero2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = numero2+1; i < numero1; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
