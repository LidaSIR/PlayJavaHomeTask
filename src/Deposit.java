import acm.program.ConsoleProgram;

import java.text.DecimalFormat;

/**
 * Created by Lida on 30.10.2016.
 */
public class Deposit extends ConsoleProgram {

    static final String DOUBLE_FORMAT = "#0.00";

    private double interest = 0;
    private double moneyAmount = 0;
    private double timePeriod = 0;

    public void run() {
        println("Enter interest amount(%): ");
        interest = readDouble();
        println("Enter money amount: ");
        moneyAmount = readDouble();
        println("Enter deposit period: ");
        timePeriod = readDouble();
        println("Enter:\n 1 to calculate simple interest\n 2 to calculate compound interest");
        int userChoose = readInt();
        switch (userChoose) {
            case 1:
               println("Your interest is " +
                        calculateSimpleInterest(interest, moneyAmount, timePeriod));
                break;
            case 2:
                println("Your interest is " +
                        calculateCompoundInterest(interest, moneyAmount, timePeriod));
                break;
        }
    }
        private String calculateSimpleInterest(double interest, double moneyAmount, double timePeriod){
           double profit = interest*moneyAmount*timePeriod/100;
            double totalAmount = profit + moneyAmount;
            String formattedDouble = new DecimalFormat(DOUBLE_FORMAT).format(totalAmount);
            return formattedDouble;
    }
        private String calculateCompoundInterest(double interest, double moneyAmount, double timePeriod){
          double profit = moneyAmount * Math.pow((1 + interest/100),timePeriod);
            double totalAmount = profit + moneyAmount;
            String formattedDouble = new DecimalFormat(DOUBLE_FORMAT).format(totalAmount);
            return formattedDouble;
        }

}

