import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 28.01.2016.
 */
public class URI_1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int N = sc.nextInt();
        double avg;
        int i = 0;

        while (i < N) {
            double N1 = sc.nextDouble();
            double N2 = sc.nextDouble();
            double N3 = sc.nextDouble();
            avg = (N1 * 2 + N2 * 3 + N3 * 5) / 10;
            System.out.println(df.format(avg));
            i++;
        }
    }
}
