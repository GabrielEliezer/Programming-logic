public class Main {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        int aux;
        System.out.println("Array Normal: ");
        for(int a =0; a<= array.length-1;a++){
            System.out.println(array[a]);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            aux =array[i];
            array[i] =array[array.length-1-i];
            array[array.length-1 -i]=aux;
        }
        System.out.println("Array Inverso: ");
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
}