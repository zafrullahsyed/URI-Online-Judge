import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double time = sc.nextDouble();
        double avgSpeed = sc.nextDouble();

        double litresReq = (avgSpeed / 12) * time;
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(litresReq));
    }
}
