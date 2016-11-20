import acm.program.ConsoleProgram;


public class GuessWord extends ConsoleProgram {
    public void run() {
        int counter = 0;

        int conceivedNumber = 1 + (int) (Math.random() * ((100 - 1) + 1));

        while (true) {
            int number = readInt("Make your guess, what number from 1 till 100 I have in mind?\n");
            counter++;
            if (number == conceivedNumber) {
                println("Good job! You did it from " + counter +" try !!!");
                return;
            } else if (number < conceivedNumber) {
                println("No, my number is bigger then " + number);
            } else {
                println("No, my number is smaller then " + number);
            }
        }
    }
}
