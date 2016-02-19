import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1170 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();


        for (int i = 0; i < testCases; i++) {
            double num = sc.nextDouble();
            int count = 0;
            if (num >= 1 && num <= 1000) {

                while (num > 1) {
                    num = num / 2;
                    count++;
                }
            }
            System.out.println(count + " " + "dias");
        }

    }
}
