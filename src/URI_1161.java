import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 09.02.2016.
 */
public class URI_1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long num1Fact = 1, num2Fact = 1;
            long num1 = sc.nextInt();
            long num2 = sc.nextInt();

            long num1Add = 1, num2Add = 1;
            if (num1 > 1 && num1 <= 20) {
                for (int i = 1; i < num1; i++) {
                    num1Add = num1Add * i;
                }
                num1Fact = num1Add * num1;
            } else if (num1 == 0 || num1 == 1) {
                num1Fact = 1;
            }
            if (num2 > 1 && num2 <= 20) {
                for (int j = 1; j < num2; j++) {
                    num2Add = num2Add * j;
                }
                num2Fact = num2Add * num2;
            } else if (num2 == 0 || num2 == 1) {
                num2Fact = 1;
            }
            System.out.println(num1Fact + num2Fact);
        }
    }
}
