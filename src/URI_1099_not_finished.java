import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 05.02.2016.
 */
public class URI_1099_not_finished {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        int count = 1, oddCount = 0;

        int numX = sc.nextInt();
        int numY = sc.nextInt();

        for (int i = 1; i <= testCases; i++) {

            for (int j = numX; j < numY; j++) {
                if ((j + 1) % 2 != 0) {
                    oddCount = oddCount + j;
                    System.out.println(oddCount);
                }
                numX = sc.nextInt();
                numY = sc.nextInt();
            }
        }

    }
}
