import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > 1 && num1 < 20 && num2 > num1 && num2 < 100000) {
            for (int i = 1; i <= num2; i++) {
                System.out.print(i + ((i % num1 == 0) ? "\n" : " "));
            }
        }

    }
}
