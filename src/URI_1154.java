import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1154 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double age = sc.nextDouble();

        double average = 0, count = 0;

        DecimalFormat df = new DecimalFormat("0.00");
        while (age >= 0) {
            average = average + age;
            count++;
            age = sc.nextInt();
        }
        double ageFinal = average / count;
        System.out.println(df.format(ageFinal));
    }
}
