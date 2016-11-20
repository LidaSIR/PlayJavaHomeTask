package lab_1;

import acm.program.ConsoleProgram;

/**
 * візьміть позитивне ціле число, назвемо його n
 якщо n парне, поділимо його на 2
 якщо n не парне, помножимой його на 3 і додамо 1
 продовжувати цей процес поки n не буде дорівнювати 1
 Напишіть програму, що реалізує вказаний алгоритм і наочно проілюструє його виконання. В кінці обов'язково повідомити кількість кроків.
 */
public class AlgorithmDescription extends ConsoleProgram {
    private static int n;
    private static int counter = 0;
    public void run(){
         n = readInt("Enter some number: \n");
        while (n != 1){
            if(n % 2 == 0){
                n /= 2;
                counter++;
            }else{
                n = n *3 + 1;
                counter++;
            }
        }
        print("There were " + counter + " actions");
    }
}
