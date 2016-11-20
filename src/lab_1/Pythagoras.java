package lab_1;

import acm.program.ConsoleProgram;

/**
 * Created by Lida on 13.11.2016.
 */
public class Pythagoras extends ConsoleProgram {
    public void run() {
        println("Enter two numbers:\n ");

        int firstNumber = readInt();
        int secondNumber = readInt();

        print((int)pythagorasTheory(firstNumber, secondNumber));
    }

    private double pythagorasTheory(int a, int b) {
        double pow_a = Math.pow(a, 2);
        double pow_b = Math.pow(b, 2);
        double squareRoot_a = Math.sqrt(pow_a);
        double squareRoot_b = Math.sqrt(pow_b);

        return squareRoot_a + squareRoot_b;
    }
}
