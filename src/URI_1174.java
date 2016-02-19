import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1174 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
            if (array[i] <= 10) {
                System.out.println("A[" + i + "] = " + array[i]);
            }
        }
    }
}
