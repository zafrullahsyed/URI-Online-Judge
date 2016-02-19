import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1429_not_finished {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String numberToString = "" + number;
        int stringLength = numberToString.length();
        System.out.println(stringLength);
        String firstNumber = "";
        for (int i = stringLength; i >= 1; i--) {
            firstNumber = String.valueOf(numberToString.charAt(stringLength));
            System.out.println(firstNumber);


        }
    }
}
