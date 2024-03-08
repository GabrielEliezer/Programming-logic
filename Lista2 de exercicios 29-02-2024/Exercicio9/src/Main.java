import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com as tres medidas: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a<b+c && a>Math.abs(b-c) &&
                b<a+c && b>Math.abs(a-c) &&
                c<b+a && c>Math.abs(b-a)){
            if(a==b && a==c)
                System.out.println("Triangulo equilatero");
            else if (a==b || a==c || b==c)
                System.out.println("Triangulo isoceles");
            else
                System.out.println("Triangulo escaleno");
        }else
            System.out.println("Os valores digitados não formam um triângulo");
    }
}
