import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double x1, x2, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe X1: ");
        x1 = in.nextDouble();

        System.out.println("Informe X2: ");
        x2 = in.nextDouble();

        b= -(x1+x2);
        c= (x1*x2);

        System.out.println("X² + (" + b +  ")X + (" + c + ") = 0");


    }
}