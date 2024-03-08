import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1,nota2,nota3,nota4, media;

        System.out.println("Informe sua Primeira Nota: ");
        Scanner primeiranota = new Scanner(System.in);
        nota1 = primeiranota.nextDouble();


        System.out.println("Informe sua Segunda Nota: ");
        Scanner segundanota = new Scanner(System.in);
        nota2 = segundanota.nextDouble();


        System.out.println("Informe sua Terceira Nota: ");
        Scanner terceiranota = new Scanner(System.in);
        nota3 = terceiranota.nextDouble();

        System.out.println("Informe sua Quarta Nota: ");
        Scanner quartanota = new Scanner(System.in);
        nota4 = quartanota.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;


        if (media < 5){

            System.out.println("Sua nota é: D " + media);
        }

        if (media >= 5 && media < 7){

            System.out.println("Sua nota é: C " + media);
        }

        if (media >=7 && media <8.5){

            System.out.println("Sua nota é: B " + media);
        }

        if (media > 8.5){

            System.out.println("Sua nota é: A " + media);
        }

    }
}