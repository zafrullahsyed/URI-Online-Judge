import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 28.01.2016.
 */
public class URI_1073 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum;
        // int sumOutput= 0;
        if (N % 2 == 0) {
            for (int i = 2; i <= N; i = i + 2) {
                sum = i * i;
                System.out.println(i + "^2" + " " + "=" + " " + sum);
            }
        } else {
            for (int j = 2; j <= N; j = j + 2) {
                sum = j * j;
                System.out.println(j + "^2" + " " + "=" + " " + sum);
            }
        }


    }
}
