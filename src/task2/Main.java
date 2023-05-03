package task2;

import java.util.Scanner;

public class Main {

    private static double sum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of numbers: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        double averageValue = sum / n;
        System.out.println("Average value is: " + averageValue);
    }
}
