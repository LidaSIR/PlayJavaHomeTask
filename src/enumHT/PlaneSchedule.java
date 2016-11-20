package enumHT;

import acm.program.ConsoleProgram;

import java.util.Scanner;

/**
 * Created by Lida on 20.11.2016.
 */
public class PlaneSchedule extends ConsoleProgram {
    public void run(){
        int day = readInt("Enter number of the day of the week: \n");
        WeekDay requestedDay = WeekDay.getDay(day);
      println(requestedDay);

    }
}
