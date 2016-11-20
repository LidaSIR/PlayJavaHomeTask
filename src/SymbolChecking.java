import acm.program.ConsoleProgram;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;

/**
 * Created by Lida on 19.11.2016.
 */
public class SymbolChecking extends ConsoleProgram {
    public void run() {
        String userInput = readLine("Type some symbol: \n");
        char[] input = userInput.toCharArray();
        if (isDigit(input[0])) {
            println("Your symbol is a number");
//        isLowerCase(input[0])
        } else if (input[0] >= 'a' && input[0] <= 'z') {
            println("Your symbol is small latin letter");
//            isLetter(input[0])
        } else if ((input[0] >= 'a' && input[0] <= 'z') || (input[0] >= 'A' && input[0] <= 'Z')) {
            println("Your symbol is latin letter");
        } else {
            println("Your input is " + input[0]);
        }
    }
}
