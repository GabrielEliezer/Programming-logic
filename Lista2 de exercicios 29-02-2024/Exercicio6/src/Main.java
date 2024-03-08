import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Informe a Opção escolhida: \n \n \n 5) Pressione 5 Para tal coisa" +
                "\n 6) Pressione 6 para tal coisa \n 7) Pressione 7 para tal coisa " +
                "\n 8) Pressione 8 para tal coisa \n 9) Pressione 9 para tal coisa");
        Scanner escolhernumero = new Scanner(System.in);
        int escolha = escolhernumero.nextInt();


        if (escolha == 5){
            System.out.println("O valor digitado é: "+ escolha);

        }

          else if (escolha == 6){
            System.out.println("O valor digitado é: "+ escolha);

        }

              else if (escolha == 7)
                  System.out.println("O valor digitado é: "+ escolha);


                  else if (escolha == 8){
                    System.out.println("O valor digitado é: "+ escolha);

        }

                  else if (escolha == 9){
                    System.out.println("O valor digitado é: "+ escolha);

        }

                       else{

                         System.out.println("A Opção Digitada é inválida!!");
        }

    }
}