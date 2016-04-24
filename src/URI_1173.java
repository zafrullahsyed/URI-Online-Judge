import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 23.04.2016.
 */
public class URI_1173 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 50){
            return;
        }else {
            System.out.println("N[] = " + num);
            for (int i = 2; i <= 10; i++) {
                num = num * 2;
                System.out.println("N[" + i + "] = " + num);
            }
        }
    }
}
