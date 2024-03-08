import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double a,b,c,x1,x2,delta;
        x1=0;
        x2=0;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor de A, B, C: ");
        a= in.nextDouble();
        b= in.nextDouble();
        c= in.nextDouble();

        delta = Math.pow(b,2) -4*a*c;

        if(delta<0){
            System.out.println("Equação sem Raiz");
        }

        else{
            x1 = (b*-1 + Math.sqrt(delta)) / (2*a);
            x2 = (b*-1 - Math.sqrt(delta)) / (2*a);
        }

        System.out.println("x1 = " +x1+ "x2 é =" + x2);


    }
}