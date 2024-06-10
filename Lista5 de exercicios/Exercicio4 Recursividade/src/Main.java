import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite uma palavra: ");
        texto = entrada.nextLine();

        if (ehPalindromo(texto))
            System.out.println("A palavra \"" + texto + "\" é um palíndromo.");
        else
            System.out.println("A palavra \"" + texto + "\" não é um palíndromo.");
    }

    public static boolean ehPalindromo(String texto) {
        if (texto.length() <= 1)
            return true;
        else {
            char primeiroChar = texto.charAt(0);
            char ultimoChar = texto.charAt(texto.length() - 1);
            String meio = texto.substring(1, texto.length() - 1);
            return (primeiroChar == ultimoChar) && ehPalindromo(meio);
        }
    }
}
