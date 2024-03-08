import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result;

        System.out.println("Informe dois valores a ser calculado:");
        Scanner in =new Scanner(System.in);
        double n1 = in.nextDouble();

        Scanner as =new Scanner(System.in);
        double n2 = as.nextDouble();

        System.out.println("Informe a operação a ser utilizada: \n\n " +
                "1) SOMA \n 2) SUBTRAÇÃO \n 3) MULTIPLICAÇÃO \n 4) DIVISÃO");

        Scanner tas = new Scanner(System.in);
                int n3 = tas.nextInt();


                switch (n3) {
                    case 1:

                        result=n1+n2;
                        System.out.println("Seu Resultado é:  " + result+" Operação realizada foi: "+ n1+"+"+n2 );
                                break;
                    case 2:
                        result= n1-n2;
                        System.out.println("Seu Resultado é: " + result+" Operação realizada foi: "+ n1+"-"+n2 );
                        break;
                    case 3:
                        result = n1*n2;
                        System.out.println("Seu Resultado é: " + result+" Operação realizada foi: "+ n1+"*"+n2 );
                        break;
                    case 4:
                        result = n1/n2;
                        System.out.println("Seu Resultado é: " + result+" Operação realizada foi: "+ n1+"/"+n2 );
                        break;
                    default:
                        System.out.println("Valor Inválido!!");

                }
    }
}