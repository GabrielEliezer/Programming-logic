import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teste = new Scanner(System.in);
        System.out.println("A formula é ax+b=0 -- Informe o Valor de 'a': ");
        double valordea = teste.nextDouble();
        double x;

        System.out.println("A formula é ax+b=0 -- Informe o Valor de 'b': ");
        double valordeb = teste.nextDouble();

        x= -valordeb/valordea;

                System.out.print("Seu valor de X é: " + x);




    }
}