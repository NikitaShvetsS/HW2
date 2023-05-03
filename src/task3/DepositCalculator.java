package task3;


public class DepositCalculator {

    public static void main(String[] args) {

        double depositAmount = Double.parseDouble(args[0]);
        double annualPercent = Double.parseDouble(args[1]);
        int depositYears = Integer.parseInt(args[2]);

        double monthlyPercent = annualPercent / 12 / 100;
        double totalAmount = depositAmount;

        for (int i = 1; i <= depositYears; i++) {
            double percentEarned= 0;
            System.out.printf("Year %d:\n", i);

            for (int j = 1; j <= 12; j++) {
                double monthlyEarned = (totalAmount * monthlyPercent);
                percentEarned += monthlyEarned;
                totalAmount += monthlyEarned;
                }

            System.out.printf("Total amount, UAH: %.2f\n", totalAmount);
            System.out.printf("Percent earned, UAH: %.2f\n", percentEarned);
            }
        }
}

