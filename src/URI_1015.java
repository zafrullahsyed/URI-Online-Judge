import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double pane_1 = x2 - x1;
        double pane_2 = y2 - y1;

        double distance = Math.sqrt(pane_1 * pane_1 + pane_2 * pane_2);
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(distance));
    }
}
