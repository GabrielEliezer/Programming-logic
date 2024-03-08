import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double area, perimetro, aux;
        System.out.println("\nInforme Sua Forma Geométrica: \n\n 1) Circulo \n 2) Triângulo Retângulo\n" +
                " 3) Retângulo\n ");

        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();

        switch (valor){
            case 1:
        System.out.println("Informe o Raio do Circulo: ");
        Scanner ia = new Scanner(System.in);
        double as = ia.nextDouble();

        area = (Math.pow(as,2)*Math.PI);
        perimetro = (2*Math.PI)*as;
        System.out.println("Seu circulo possui: \n 1) ÁREA: "+ area + "\n 2) PERIMETRO: " + perimetro);
        break;

             case 2:
                System.out.println("Informe o valor da Base e da altura ");
                Scanner ib = new Scanner(System.in);
                double asa = ib.nextDouble();

                Scanner ic = new Scanner(System.in);
                double asb = ic.nextDouble();

                 area = (asa*asb)/2;
                 aux = (asa+asb) - area;
                 perimetro = asa+asb+aux;
                System.out.println("Seu Triângulo Retângulo possui: \n 1) ÁREA: "+ area + "\n 2) PERIMETRO: " + perimetro);
                break;

                 case 3:

                System.out.println("Informe o valor da Base e da altura ");
                Scanner ie = new Scanner(System.in);
                double asu = ie.nextDouble();

                Scanner iaas = new Scanner(System.in);
                double ast = iaas.nextDouble();

                 area = asu*ast;
                 perimetro = Math.pow(asu,2) + Math.pow(ast,2);
                System.out.println("Seu Retângulo possui: \n 1) ÁREA: "+ area + "\n 2) PERIMETRO: " + perimetro);
                break;

        }

    }
}