import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 29.01.2016.
 */
public class URI_1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double[] array = new double[6];
        int count = 0;
        double avgCount = 0;
        DecimalFormat df = new DecimalFormat("0.0");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
            if (array[i] > 0) {
                count++;
                avgCount = avgCount + array[i];
            }
        }
        System.out.println(count + " " + "valores positivos");
        System.out.println(df.format(avgCount / 4));
    }
}
