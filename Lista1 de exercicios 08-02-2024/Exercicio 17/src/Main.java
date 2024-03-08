import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner teste = new Scanner(System.in);

        System.out.println("Informe a velocidade Inicial: ");
        double velocidadeinicial = teste.nextDouble();

        System.out.println("Informe a Aceleração: ");
        double aceleração = teste.nextDouble();

        System.out.println("Informe o Intervalo de Tempo: ");
        double intervalodetempo = teste.nextDouble();

        double velocidadefim;

        velocidadefim = velocidadeinicial + (aceleração*intervalodetempo);

        System.out.println("Sua velocidade final é:" + velocidadefim);


    }
}