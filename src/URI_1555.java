import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            double numX = sc.nextDouble();
            double numY = sc.nextDouble();
            if (numX >= 1 && numY <= 100) {
                double rafelOutput = rafael(numX, numY);
                double betoOutput = beto(numX, numY);
                double carlosOutput = carlos(numX, numY);

                if (rafelOutput > betoOutput && rafelOutput > carlosOutput) {
                    System.out.println("Rafael ganhou");
                } else if (betoOutput > rafelOutput && betoOutput > carlosOutput) {
                    System.out.println("Beto ganhou");
                } else {
                    System.out.println("Carlos ganhou");
                }
            }
        }
    }

    public static double rafael(double X, double Y) {
        double rafaelOutput = ((X * 3) * (X * 3)) + (Y * Y);
        return rafaelOutput;

    }

    public static double beto(double X, double Y) {
        double betoOutput = (2 * (X * X)) + ((5 * Y) * (5 * Y));
        return betoOutput;

    }

    public static double carlos(double X, double Y) {
        double carlosOutput = (-100 * X) + (Y * Y * Y);
        return carlosOutput;

    }
}
