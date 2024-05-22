//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] vector = {10,20,30,40,50, 60,70,80,90};
        int [] rotcev = new int[vector.length];

        for(int i=0;i< vector.length;i++){
            rotcev[(vector.length-1)-i]=vector[i];
        }
        for (int n: vector) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n: rotcev) {
            System.out.print(n + " ");
        }
    }
}