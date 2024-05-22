public class Main {
    public static void main(String[] args) {

        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<vector.length;i++){
            if (i%2==0)
                vector[i]+=2;
            else
                vector[i]*=2;
            System.out.println(vector[i]);
        }
        }
    }