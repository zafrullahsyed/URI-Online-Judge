import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1198_not_complete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long num1 = sc.nextLong();
            long num2 = sc.nextLong();
            long difference;
            if (num1 <= 4294967296L && num2 <= 4294967296L) {
                if (num1 > num2) {
                    difference = num1 - num2;
                    System.out.println(difference);
                }
                if (num2 > num1) {
                    difference = num2 - num1;
                    System.out.println(difference);
                }
            }
        }
    }
}
