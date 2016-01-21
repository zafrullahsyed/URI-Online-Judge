import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        float fuelSpent = sc.nextFloat();

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(distance / fuelSpent) + " " + "km/l");
    }
}
