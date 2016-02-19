import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 29.01.2016.
 */
public class URI_1071 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        int sum = 0;

        if (numOne > numTwo) {
            for (int i = numTwo + 1; i < numOne; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        } else if (numOne == numTwo) {
            System.out.println(numOne - numTwo);
        }

        if (numOne < numTwo) {
            for (int i = numOne + 1; i < numTwo; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }
}
