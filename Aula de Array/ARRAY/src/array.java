import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class array {
    public static void main(String[] args) {

        // int [] numeros = {1,9,6,7,8};
        int [] numeros = new int[5];

        System.out.println("Informe Seus 5 Números:");
        Scanner in=new Scanner(System.in);

        for(int i=0; i< numeros.length; i++) {
            numeros[i] = in.nextInt();
        }

        for(int j=0; j< numeros.length; j++) {
            System.out.println("Seus valores são: " + numeros[j]);
        }


       //  for (int i=0;i< numeros.length;i++) {
       //     System.out.println(numeros[i]);  //ESSE COMANDO .length RETORNA O TAMANHO DA ARRAY


        System.out.println("Seus valores em Ordem Contrária são: ");
        for (int i=numeros.length-1;i>=0;i--){ //No comando numeros.length-1, esse -1 serve pois
            System.out.println(numeros[i]);    // o vetor começa em 0, ele reduz 1 valor
        }
        }
    }