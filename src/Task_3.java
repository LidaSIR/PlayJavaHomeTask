/**
 * Created by Lida on 06.11.2016.
 */
//C(n, k) = n! / (k! (n-k)!)
    //n<=1 або k=0 або n=m
public class Task_3  {
    public static void main(String[] args) {
        System.out.println(pascal(5,2));

    }
    private static int pascal(int n, int k){
        if(n <= 1 ||k == 0) return 1;
        return factorialR(n) / (factorialR(k)* (factorialR(n-k)));
    }
    private static int factorialR(int a){
        if(a == 1) return 1;
        return  factorialR(a-1)* a;
    }

}
