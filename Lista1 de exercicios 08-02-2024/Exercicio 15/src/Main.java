import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.print("Informe o Raio do Cilindro:");
        Scanner asp = new Scanner(System.in);

        double raiocil, alturacil, vol;

        raiocil = asp.nextDouble();
        raiocil= Math.pow(raiocil,2);


        System.out.print("Informe a Altura do Cilindro: ");
        Scanner asp1 = new Scanner(System.in);

        alturacil = asp1.nextDouble();

        vol= 3.14159 * raiocil*alturacil;

        System.out.print("O volume do Cilindro é:" + vol);


    }
}