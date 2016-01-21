import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();

        if (a > b && a > s) {
            System.out.println(a + " " + "eh" + " " + "o" + " " + "maior");
        } else if (b > a && b > s) {
            System.out.println(b + " " + "eh" + " " + "o" + " " + "maior");
        } else {
            System.out.println(s + " " + "eh" + " " + "o" + " " + "maior");
        }
    }
}
