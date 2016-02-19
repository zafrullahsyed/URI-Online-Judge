import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1021_not_complete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double monetaryValue = sc.nextDouble();
        double quotient = 0, reminder = 0;

        if (monetaryValue >= 0 && monetaryValue <= 1000000.00) {
            System.out.println("NOTAS:");
            if (monetaryValue / 100 > 0) {
                quotient = monetaryValue / 100;
                reminder = monetaryValue % 100;
                System.out.println(quotient + " " + "nota(s) de R$ 100.00");
            } else {
                System.out.println(0 + "nota(s) de R$ 100.00");
            }
            if (reminder / 50 > 0) {
                quotient = reminder / 50;
                reminder = reminder % 50;
                System.out.println(quotient + " " + "nota(s) de R$ 50.00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 50.00");
            }
            if (reminder / 20 > 0) {
                quotient = reminder / 20;
                reminder = reminder % 20;
                System.out.println(quotient + " " + "nota(s) de R$ 20.00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 20.00");
            }
            if (reminder / 10 > 0) {
                quotient = reminder / 10;
                reminder = reminder % 10;
                System.out.println(quotient + " " + "nota(s) de R$ 10.00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 10.00");
            }
            if (reminder / 5 > 0) {
                quotient = reminder / 5;
                reminder = reminder % 5;
                System.out.println(quotient + " " + "nota(s) de R$ 5.00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 5.00");
            }
            if (reminder / 2 > 0) {
                quotient = reminder / 2;
                reminder = reminder % 2;
                System.out.println(quotient + " " + "nota(s) de R$ 2.00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 2.00");
            }
            System.out.println("MOEDAS:");

            if (reminder / 1 > 0) {
                quotient = reminder / 1;
                reminder = reminder % 1;
                System.out.println(quotient + " " + "nota(s) de R$ 1.00");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 1.00");
            }
            if (reminder / 0.50 > 0) {
                quotient = reminder / 0.50;
                reminder = reminder % 0.50;
                System.out.println(quotient + " " + "nota(s) de R$ 0.50");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 0.50");
            }
            if (reminder / 0.25 > 0) {
                quotient = reminder / 0.25;
                reminder = reminder % 0.25;
                System.out.println(quotient + " " + "nota(s) de R$ 0.25");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 0.25");
            }
            if (reminder / 0.10 > 0) {
                quotient = reminder / 0.10;
                reminder = reminder % 0.10;
                System.out.println(quotient + " " + "nota(s) de R$ 0.10");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 0.10");
            }
            if (reminder / 0.05 > 0) {
                quotient = reminder / 0.05;
                reminder = reminder % 0.05;
                System.out.println(quotient + " " + "nota(s) de R$ 0.05");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 0.05");
            }
            if (reminder / 0.01 > 0) {
                quotient = reminder / 0.01;
                reminder = reminder % 0.01;
                System.out.println(quotient + " " + "nota(s) de R$ 0.01");
            } else {
                System.out.println(0 + " " + "nota(s) de R$ 0.01");
            }

        }

    }
}
