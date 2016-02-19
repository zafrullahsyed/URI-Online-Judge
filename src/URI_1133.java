import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 01.02.2016.
 */
public class URI_1133 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X < Y) {
            for (int i = X + 1; i < Y; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else if (X > Y) {
            for (int i = Y + 1; i < X; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }

        }


    }
}
