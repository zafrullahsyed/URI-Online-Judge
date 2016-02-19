import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long leastNum = sc.nextLong();
        long highNum = sc.nextLong();
        long naturalNumCount = 0;
        if (leastNum >= 1 && highNum <= 1000000000L) {

            for (long i = leastNum; i <= highNum; i++) {
                naturalNumCount = naturalNumCount + i;
            }
            System.out.println(naturalNumCount);
        }

    }
}
