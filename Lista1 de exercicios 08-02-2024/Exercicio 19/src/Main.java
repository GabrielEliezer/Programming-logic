import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teste = new Scanner(System.in);
        System.out.println("Informe o Valor de 'a': ");
        double valordea = teste.nextDouble();
        double x1, x2, delta;

        System.out.println("Informe o Valor de 'b': ");
        double valordeb = teste.nextDouble();

        System.out.println("Informe o Valor de 'c': ");
        double valordec = teste.nextDouble();



        delta= Math.pow(valordeb,2)-4*valordea*valordec;

        x1 = (-valordeb + Math.sqrt(delta))/(2*valordea);

        x2 = (-valordeb - Math.sqrt(delta))/(2*valordea);



        System.out.print(valordea+"x^2 + (" + valordeb + ")X + ("+valordec+") = 0, \n \nEntão\n x1 = "+ x1+ "\nx2 = " + x2 );






    }
}