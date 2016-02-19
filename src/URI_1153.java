import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1153 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int factCount = 1;
        int factMinus;

        if (num > 0 && num < 13) {
            for (int i = 1; i < num; i++) {
                factCount = factCount * i;

            }
            factMinus = factCount * num;
            System.out.println(factMinus);
        }
    }
}
