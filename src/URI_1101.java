import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 12.02.2016.
 */
public class URI_1101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp;
        while (num1 != 0 && num2 != 0 && num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            int numAddition = 0;
            for (int i = num1; i <= num2; i++) {
                numAddition = numAddition + i;
                System.out.print(i + " ");
            }
            System.out.println("Sum=" + numAddition);
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
    }
}
