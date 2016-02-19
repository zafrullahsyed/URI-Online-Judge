import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 04.02.2016.
 */
public class URI_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num < 10000) {
            for (int i = 1; i <= 10000; i++) {
                if (i % num == 2) {
                    System.out.println(i);
                }
            }

        }
    }
}
