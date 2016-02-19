import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 22.01.2016.
 */
public class URI_1078 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N > 1 && N < 1000) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " " + "x" + " " + N + " " + "=" + " " + i * N);
            }
        }
    }
}
