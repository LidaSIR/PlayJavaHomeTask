import acm.program.ConsoleProgram;

/**
 * Програма має рахувати числа Фібоначі і виводити результати на екран у формі:
 * 0 - 0
 * 1 - 1
 * 2 - 1
 * 3 - 2
 * і так далі
 * Кількість чисел Фібоначі, що необхідно вивести вводить користувач.
 */

public class RecurrenceRelations extends ConsoleProgram {
    public void run() {
        println("FIRST TASK: ");
        int userNum = readInt("Enter number: ");
        int fibonacciNum = fibonacciRecursion(userNum);
        int fibonacciLoop = fibonacciLoop(userNum);
        println("Fibonacci numbers with recursion: \n"+ userNum + " - " + fibonacciNum);
        println("Fibonacci numbers with loop: \n"+ userNum + " - " + fibonacciLoop);

        println("SECOND TASK: ");
        int number = readInt("Enter number: ");
        int numberAmount = calculateNumAmount(number);
        println(numberAmount);

    }

    private int fibonacciRecursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
    private int fibonacciLoop(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        int num1 = 1;
        int num2 = 1;
        int tmp = 0;
        for(int i = 0; i < n; i++){
            tmp = num1;
            num1 = num2;
            num2 = tmp + num1;
        }
        return tmp;
    }
    /**
     * Написати программу обчислення кількості (ми не знаємо кількість цифр) десяткових цифр натурального числа
     * Наприклад при введенні числа 4523678, програма має повернути 7.
     */
    private int calculateNumAmount(int number) {
       if(number == 0) return 0;
        if(number <= 9)return 1;
        return 1 + calculateNumAmount(number/10);
    }

}
