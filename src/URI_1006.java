import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        //float MEDIA = 0;
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        DecimalFormat df = new DecimalFormat("#.0");
        float MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);
        System.out.println("MEDIA" + " " + "=" + " " + df.format(MEDIA));

    }
}
