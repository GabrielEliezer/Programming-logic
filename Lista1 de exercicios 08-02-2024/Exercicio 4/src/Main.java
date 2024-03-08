import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double n1, n2, media;

        System.out.println("Informe o Valor da Primeira Nota:");
        Scanner nota1 = new Scanner(System.in);
        n1= nota1.nextDouble();

        System.out.println("Informe o Valor da Segunda Nota:");
        Scanner nota2 = new Scanner(System.in);
        n2= nota2.nextDouble();

        media = (n1+n2)/2;

        System.out.println("A Média entre ambas as notas Informadas é:" + media);


    }
}