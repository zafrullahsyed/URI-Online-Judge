import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 28.01.2016.
 */
public class URI_1080 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int[] array = new int[5];
        int i, arrayMax = 0, arrayPos = 0;

        Scanner sc = new Scanner(System.in);
        for (i = 0; i < array.length; i++) {

            array[i] = sc.nextInt();
            if (array[i] > arrayMax) {
                arrayMax = array[i];
                arrayPos = i;
            }
        }
        System.out.println(arrayMax + "\n" + (arrayPos + 1));
    }
}
