import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1042_not_complete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y && x > z) {
            System.out.println(x + '\n');
        } else {
            if (y > x && y > z) {
                System.out.println(z + '\n');
            } else {
                System.out.println(y + '\n');
            }
        }
        System.out.println(x + '\n');
        System.out.println(y + '\n');
        System.out.println(z + '\n');
    }

}
