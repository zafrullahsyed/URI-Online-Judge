import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 05.02.2016.
 */
public class URI_1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("0.0");
        double a, b;
        for (int i = 0; i < N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(df.format(a / b));
            }
        }
    }
}
