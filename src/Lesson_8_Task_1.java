import acm.program.ConsoleProgram;

/**
 * Created by Lida on 06.11.2016.
 */
public class Lesson_8_Task_1 extends ConsoleProgram {
    public void run(){
        int userNum = readInt("Enter number: ");
        int limitationNum = readInt("Enter number: ");
        int fibonacciNum = fibonacciRecursion(userNum, limitationNum);
        println("User number is " + userNum + ", fibonacci: " + fibonacciNum);
    }
    private int fibonacciRecursion(int n, int limitationNum) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int num1 = 1;
        int num2 = 1;
        int tmp = 0;
        for(int i = 0; i < n; i++){
            tmp = num1;
            num1 = num2;
            num2 = tmp + num1;
            println(tmp);
            if(tmp >= limitationNum) {
               println("printing was stopped by users limitation number - " + limitationNum);
                break;
            }
        }
        return tmp;
    }
}
