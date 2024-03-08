import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe Seu valor em Milhas: ");

        Scanner mil = new Scanner(System.in);

        double milhasvalue, result;

        milhasvalue = mil.nextDouble();

        result = milhasvalue / 0.621371;

        System.out.println("Seu valor em Km é: " + result);

    }
}