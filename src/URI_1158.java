import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 01.02.2016.
 */
public class URI_1158 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while (testCases != 0){
            int oddCount = 0;
            int  number = sc.nextInt();
            int iteratorCount = sc.nextInt();
            for (int j = 1 ; j <= iteratorCount; j++){
                if (number % 2 == 0){
                    number = number + 1;
                    oddCount = oddCount + number;
                    number++;
                }else {
                    oddCount = oddCount + number;
                    number = number + 2;
                }

            }
            System.out.println(oddCount);
            testCases--;
        }

    }
}
