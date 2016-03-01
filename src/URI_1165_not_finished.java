import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 24.02.2016.
 */
public class URI_1165_not_finished {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        if (testCases >= 1 && testCases <= 100) {
            for (int i = 1; i <= testCases; i++) {

                int findPrime = sc.nextInt();
                if (findPrime > 1 && findPrime <10000000) {
                    if (findPrime == 2 || findPrime == 3 || findPrime == 5 || findPrime == 7){
                        System.out.println(findPrime + " " + "eh primo");
                    } else if (findPrime % 2 == 0 || findPrime % 3 == 0 || findPrime %5 == 0 || findPrime %7 == 0){
                        System.out.println(findPrime + " " + "nao eh primo");
                    } else {
                        System.out.println(findPrime + " " + "eh primo");
                    }
                }
            }
        }
    }
}
