import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 22.04.2016.
 */
public class URI_1159_not_finished {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int iterator = 1;
        if (num == 0){
            return;
        }else {
            while (iterator <= 5) {
                int evenSum = 0;
                for (int i = 0; i < 5; i++) {
                    if (num % 2 == 0) {
                        evenSum = evenSum + num;
                        num = num + 2;
                        iterator++;
                    } else {
                        num = num + 1;
                        evenSum = evenSum + num;
                        num = num + 1;
                        iterator++;
                    }
                    System.out.println(evenSum);
                }
                num = sc.nextInt();
                iterator = 0;
                if (num == 0){
                    return;
                }
            }
            }
    }
}
