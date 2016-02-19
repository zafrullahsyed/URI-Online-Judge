import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1221_not_finished {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            long findPrime = sc.nextLong();
            if (findPrime >= 1 && findPrime < 2147483648L) {
                if (findPrime != 1 && findPrime != 2 && findPrime % 2 == 0 || findPrime != 3 && findPrime % 3 == 0 || findPrime != 5 && findPrime % 5 == 0 || findPrime != 7 && findPrime % 7 == 0) {

                    System.out.println("Not Prime");
                } else {
                    System.out.println("Prime");
                }
            }
        }
    }
}
