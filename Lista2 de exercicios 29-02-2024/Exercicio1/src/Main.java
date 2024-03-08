import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Informe um numero:");
        Scanner numero01 = new Scanner(System.in);
        double variavel01 = numero01.nextDouble();

        if(variavel01 > 0){
            System.out.println("A raiz do numero informado é:"+ Math.sqrt(variavel01));
        }
        else{
            System.out.println("Numero inválido!");
        }
    }
}