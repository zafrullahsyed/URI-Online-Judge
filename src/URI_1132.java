import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 28.01.2016.
 */
public class URI_1132 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;

        if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    sum = sum + i;
                }
            }
        }

        if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    sum = sum + i;
                }
            }
        }
        System.out.println(sum);
    }
}
