import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Informe o Raio do Cone:");
        Scanner asp = new Scanner(System.in);

        double raiocone, alturacone, volumecone;

        raiocone = asp.nextDouble();
        raiocone = Math.pow(raiocone,2);





        System.out.println("Informe a Altura do Cone");
        Scanner asp1 = new Scanner(System.in);
        alturacone = asp1.nextDouble();

        volumecone = ((3.14159*raiocone*alturacone)/3);

        System.out.println("O volume do Seu Cone é: " + volumecone);
    }
}