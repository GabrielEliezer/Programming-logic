import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe um valor:");
        Scanner valora = new Scanner(System.in);
        int valora1 = valora.nextInt();


        if(valora1 %2==0){

            System.out.println("Seu valor é Par");
        }
        else{
            System.out.println("Seu valor é Impar");

        }



    }
}