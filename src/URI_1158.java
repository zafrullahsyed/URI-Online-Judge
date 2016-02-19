import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 01.02.2016.
 */
public class URI_1158 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        int numX = sc.nextInt();
        int numY = sc.nextInt();
        int count, numBuffer = 0;

        if (numX % 2 != 0) {
            for (count = 1; count < numY; count++) {
                numX = numX + 2;
            }
            System.out.println(numX);
        }
    }
}
