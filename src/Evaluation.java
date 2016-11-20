import acm.program.ConsoleProgram;

/**
 * Created by Lida on 30.10.2016.
 */
// A - 91-100 B - 81- 90 C - 71-80 D - 61-70 E - 0-60

public class Evaluation extends ConsoleProgram {
    public void run() {
        println("Enter students mark in grade from 1 to 100: ");
        int studentMark = readInt();
        if (studentMark >= 91 && studentMark <= 100) {
            println("Your mark is A!");
        } else if (studentMark >= 81 && studentMark <= 90) {
            println("Your mark is B!");
        } else if (studentMark >= 71 && studentMark <= 80) {
            println("Your mark is C!");
        } else if (studentMark >= 61 && studentMark <= 70) {
            println("Your mark is D!");
        } else if (studentMark >= 0 && studentMark <= 60) {
            println("Your mark is E!");
        }
    }
}