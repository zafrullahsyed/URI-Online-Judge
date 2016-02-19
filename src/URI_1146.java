import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        while (num != 0) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + ((i % num == 0) ? "\n" : " "));
            }
            num = sc.nextInt();
        }
    }
}
