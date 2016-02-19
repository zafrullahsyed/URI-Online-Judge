import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 24.01.2016.
 */
public class URI_1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int evenCount = 0;

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount + " " + "valores pares");
    }
}
