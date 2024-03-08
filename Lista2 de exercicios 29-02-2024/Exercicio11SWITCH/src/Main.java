import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe um número de 1 até 7");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();

        switch (n1){

            case 1:
                System.out.println("Segunda-Feira");
                break;

            case 2:
                System.out.println("Terça-Feira");
                break;

            case 3:
                System.out.println("Quarta-Feira");
                break;

            case 4:
                System.out.println("Quinta-Feira");
                break;


            case 5:
                System.out.println("Sexta-Feira");
                break;

            case 6:
                System.out.println("Sabado-Feira");
                break;


            default:
                System.out.println("Valor Inválido");

        }
    }
}