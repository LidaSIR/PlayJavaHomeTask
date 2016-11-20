import acm.program.ConsoleProgram;

/**
 * Created by Lida on 13.11.2016.
 */
public class Methods extends ConsoleProgram {
    private static int AMOUNT_OF_NUMBERS = 11;
    public void run(){
        String fullName = readLine("Write your full name: \n");
        int printingCopies = 10; // by creating this variable we've made quantity of printing copies optional
        printFullName(fullName, printingCopies);
        println("**********************************");
        printSqrt();
        println("**********************************");
        printOddSqrt();
        println("**********************************");

        int sumNumber = readInt("Enter number: \n");
        sumFirstNumber(sumNumber); // fibonacci
        println("**********************************");
        int sumNum = readInt("Enter number: \n");
        sumNumbers(sumNum);
    }
    /** метод, що 10 разів виводить на екран ім'я й прізвище.*/
    private void printFullName(String fullName, int quantity){
        for(int i = 0; i < quantity; i++) print(fullName + "\n");
    }
    /** метод, що виводить таблицю квадратів перших десяти цілих позитивних чисел */
    private void printSqrt(){
        for(int i = 1; i < AMOUNT_OF_NUMBERS; i++){
            println("Square root from "+ i + " is " + Math.sqrt(i));
        }
    }
    /**метод, що виводить таблицю квадратів перших п'яти цілих позитивних непарних чисел*/
    private void printOddSqrt(){
        for(int i = 0; i < AMOUNT_OF_NUMBERS; i++){
            if(i%2 != 0){
                println("Square root from "+ i + " is " + Math.sqrt(i));
            }
        }
    }
    /**метод, що обчислює суму перших n цілих позитивних цілих чисел.
     * Кількість сумуємих чисел повинна вводитися під час роботи програми */
    private  void sumFirstNumber(int digit){
        if (digit == 0) println("Sum of first natural numbers of inputted digit is 0");
        if (digit == 1) println("Sum of first natural numbers of inputted digit is 1");
        int num1 = 1;
        int num2 = 1;
        int sum;
        for(int i = 0; i < digit; i++){
            sum = num1;
            num1= num2;
            num2 = sum + num1;
            println("Sum of first natural numbers of inputted digit is " + sum);
        }
    }
    /** метод, що обчислює суму перших n членів ряду 1, 3, 5, 7, ....
     *  Кількість сумуємих чисел повинна вводитися під час роботи програми*/
    private  void sumNumbers(int digit){
        if (digit == 0) println("Sum of first natural numbers of inputted digit is 0");
        if (digit == 1) println("Sum of first natural numbers of inputted digit is 1");
        int num1 = 1;
        int num2 = 1;
        int sum;
        for(int i = 1; i < digit; i+=2){
            sum = num1 + 2;
            num1= num2;
            num2 = sum + num1;

            println("Sum of first natural numbers of inputted digit is " + sum);
        }
    }
}
