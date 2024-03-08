import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        System.out.println("Informe uma Tabuada: ");
        Scanner tabuada = new Scanner(System.in);
        int valordatabuada = tabuada.nextInt();

        System.out.println("Sua tabuada é a do " + valordatabuada+"\n\n");

        int i = 0;

        while (i<10){

            for (int j=0; j<10;j++);{
                int resultado = valordatabuada* i;
            System.out.println( valordatabuada + "x" + i +" = "+ resultado);

        i++;

            }



        }

    }
}