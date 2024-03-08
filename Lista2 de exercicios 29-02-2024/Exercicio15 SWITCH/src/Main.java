import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nSELECIONE O ITEM DESEJADO: \n 1) Café Expresso R$0,50" +
                "\n 2) Café Longo R$1,00  \n 3) Capuccino R$2,50 \n 4) Chocolate R$2,00 ");

        System.out.println("\nEscolha uma Opção:");
        Scanner in = new Scanner(System.in);
        int cachorro = in.nextInt();

        System.out.println("\nInsira seu Dinheiro:");
        Scanner ie = new Scanner(System.in);
        int cachorra = ie.nextInt();

        double res;



        switch (cachorro){

            case 1:
                res=cachorra-0.50;
                System.out.println("Seu pedido foi um Café Expresso no valor de R$0.50, seu troco é: R$" + res);

        break;
            case 2:
                res= cachorra - 1.00;
                System.out.println("Seu pedido foi um Café Longo no valor de R$1.00, seu troco é: R$" + res);
            break;

            case 3:
                res= cachorra - 2.50;
                System.out.println("Seu pedido foi um Café Longo no valor de R$2.50, seu troco é: R$" + res);
                break;

            case 4:
                res= cachorra - 2.00;
                System.out.println("Seu pedido foi um Café Longo no valor de R$2.00, seu troco é: R$" + res);

                break;
        }

    }
}