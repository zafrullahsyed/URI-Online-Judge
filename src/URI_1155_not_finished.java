import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */

// S = 1 + 1/2 + 1/3 + … + 1/100
public class URI_1155_not_finished {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");

        double sequence = 1;
        for (int i = 1; i < 100; i++) {
            sequence += 1.0 / (double) i;
            System.out.println(df.format(sequence));
        }
        //sequence = sequence + 1;
    }
}
