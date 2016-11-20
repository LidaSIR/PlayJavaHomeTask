package lab_1;

import acm.program.ConsoleProgram;

/**
 Написати програму, що зчитує з клавіатури цілі числа (по одному числу за раз), поки користувач не введе число 0
 (ви маєте бути в змозі легко поміняти цю умову на якесь інше число).
 По закінченню вводу ваша програма має вивести найменше і найбільше число.
 Якщо користувач введе лише одне число, програма має повідомити що це число і найбільше і найменше
 Якщо користувач в першій же стрічці введе символ закінчення вводу, тоді вважається,
 що жодного числа не уло введено і програма має це повідомити.
 */
public class Max_Min_Number extends ConsoleProgram {
    private static int STOP_ENTERING = 0;
    private  static int min = 0;
    private static int max = 0;
    public void run(){
        int userInput = readInt("Enter number: \n");

            if(userInput == STOP_ENTERING){
                println("There is no number entered! Try again");
                findMaxMin();
            }else  {
                findMaxMin();
            }
        }
    private void findMaxMin(){

        while (true){
            int userInput = readInt("Enter number: \n");
            if(userInput == STOP_ENTERING){
                break ;
            }else if(userInput < min){
                min = userInput;
            }else if (userInput > max){
                max = userInput;
            }
        }
        print("Max number is "+max + " \nMin number is " + min);
    }
}
