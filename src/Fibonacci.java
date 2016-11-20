import java.util.Scanner;

/**
 * Created by Lida on 06.11.2016.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int userNumber = scan.nextInt();

        int fibNum = fibonacciRecursion(userNumber);
        System.out.println(fibNum);
    }
    private static int fibonacciRecursion(int n){
        if (n == 0) return 0;
        if(n == 1) return 1;
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);

    }
}
