import java.util.Locale;

/**
 * Created by ${ZafrullahSyed} on 22.01.2016.
 */
public class URI_1059 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int[] array;
        array = new int[100];
        for (int i = 1; i <= array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            //System.out.println(i);
        }
    }
}
