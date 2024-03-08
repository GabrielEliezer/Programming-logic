public class Main {
    public static void main(String[] args) {

        System.out.println("Graus Celsius     Graus Fahrenheit");


        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

            System.out.println(celsius + "               " + fahrenheit);
        }
    }
}
