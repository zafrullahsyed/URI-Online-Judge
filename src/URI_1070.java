import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 22.01.2016.
 */
public class URI_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = a; i < a + 12; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
