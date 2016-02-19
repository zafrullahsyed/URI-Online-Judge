import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double trapezium = ((A + B) / 2) * C;
        double periTriangle = A + B + C;

        DecimalFormat df = new DecimalFormat("0.0");

        if (A + B > C && B + C > A && A + C > B) {
            System.out.println("Perimetro =" + " " + df.format(periTriangle));
        } else {
            System.out.println("Area =" + " " + df.format(trapezium));
        }
    }
}
