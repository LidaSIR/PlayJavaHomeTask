import acm.program.ConsoleProgram;

/**
 * Created by Lida on 06.11.2016.
 */
public class Factorial extends ConsoleProgram {
    public void run(){
        println("Enter number: ");
        int a = readInt();
        println(factorial(a));
        println(factorialR(a));

    }
    private int factorial(int a){
        int result = 1;
        for(int i = 2; i <= a; i++){
            result *=i;
        }
        return result;
    }
    private int factorialR(int a){
        if(a == 1) return 1;
        return  factorialR(a-1)* a;
    }
}
