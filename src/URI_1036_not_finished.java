import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 28.01.2016.
 */
public class URI_1036_not_finished {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double X1 = (-B + Math.sqrt((B * B) - 4 * A * C)) / 2 * A;
        double X2 = (-B - Math.sqrt((B * B) - 4 * A * C)) / 2 * A;
        DecimalFormat df = new DecimalFormat("0.0000");
        if (A != 0 && A > 0) {
            System.out.println("R1 = " + df.format(X1));
            System.out.println("R2 = " + df.format(X2));
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
