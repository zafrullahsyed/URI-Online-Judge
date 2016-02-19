import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 01.02.2016.
 */
public class URI_1157 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }
}
