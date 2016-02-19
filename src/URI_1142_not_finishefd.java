import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 18.02.2016.
 */
public class URI_1142_not_finishefd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + ((i % num == 0) ? "\n" : " "));
        }

    }
}
