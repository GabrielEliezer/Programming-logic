import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe um Valor:");
        Scanner cachorro =new Scanner(System.in);

        int valor1, result;

        valor1 = cachorro.nextInt();

        result = valor1*2;

        System.out.println("Seu valor é: " + result);
    }
}