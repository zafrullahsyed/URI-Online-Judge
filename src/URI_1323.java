import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1323 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n >= 1 && n <= 100) {
            n = (n * (n + 1) * ((2 * n) + 1)) / 6;
            System.out.println(n);
            n = sc.nextInt();
        }
    }
}
