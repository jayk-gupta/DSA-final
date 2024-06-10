public class Main {
    public static void main(String[] args) {

        int n = 14;
        System.out.println(numofsteps(n));
    }
    public static int numofsteps(int n){
        int steps =0;
        while (n>0){
            if(n%2==0){
                n=n/2;
            }
            else{
                n--;
            }
            steps++;
        }
        return  steps;
    }
}