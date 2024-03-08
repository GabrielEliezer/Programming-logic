public class Main {
    public static void main(String[] args) {

        for (int tabuada = 1; tabuada <= 10; tabuada++) {
            System.out.println("Tabuada do " + tabuada + ":");


            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }

            System.out.println(" ");
        }
    }
}
