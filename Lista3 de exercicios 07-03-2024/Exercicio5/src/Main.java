import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n,f;
        f=1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Digite um numero: ");
            n = in.nextInt();
        }while(n<0);

        for(int i=n;i>1;i--)
            f=f*i;

        //for(int i=1;i<=n;i++)
        //f*=i;

        System.out.println(n+"!= "+f);
    }
}
