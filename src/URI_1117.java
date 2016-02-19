import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 28.01.2016.
 */
public class URI_1117 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double average;
        double score1 = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        while (score1 < 0 || score1 > 10) {
            System.out.println("nota invalida");
            score1 = sc.nextDouble();

        }
        double score2 = sc.nextDouble();
        while (score2 < 0 || score2 > 10) {
            System.out.println("nota invalida");
            score2 = sc.nextDouble();
        }
        if (score1 >= 0.00 || score1 <= 10.00 || score2 >= 0.00 || score2 <= 10.00) {
            average = (score1 + score2) / 2;
            System.out.println("media =" + " " + df.format(average));
        }
    }
}