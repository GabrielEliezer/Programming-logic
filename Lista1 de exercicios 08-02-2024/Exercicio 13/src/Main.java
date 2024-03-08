import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe o Raio do Circulo: ");
        Scanner asp =new Scanner(System.in);

        double raio, area, result;

        raio = asp.nextDouble();

        area = (Math.pow(raio,2)*3.141592);

        System.out.println("A area do circulo é: " + area);

    }
}