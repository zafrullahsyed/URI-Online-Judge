import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 22.01.2016.
 */
public class URI_1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int posCounter = 0;
        Scanner sc = new Scanner(System.in);

        double[] array = new double[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
            //System.out.println("array" + array[i]);
            if (array[i] > 0) {
                posCounter++;
            }
        }
        System.out.println(posCounter + " " + "valores positivos");
    }
}
