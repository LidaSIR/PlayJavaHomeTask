import acm.program.ConsoleProgram;

import java.util.Scanner;

/**
 * Created by Lida on 01.11.2016.
 */
public class TowerOfHanoi{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of disks: ");
        int diskAmount = scan.nextInt();
        String tower1 = "A";
        String tower2 = "B";
        String tower3 = "C";

        moveDisk(diskAmount,tower1, tower2, tower3);

    }
    private static void moveDisk(int diskAmount, String tower1,String tower2, String tower3){
        if(diskAmount == 1) {
            System.out.printf("move disk from %s to %s \n ", tower1,tower3);
        }else{
            moveDisk(diskAmount - 1, tower1,tower3,tower2);
            System.out.printf("move disk from %s to %s \n ", tower1,tower3);
            moveDisk(diskAmount - 1,tower2,tower1,tower3);
        }

    }
}
