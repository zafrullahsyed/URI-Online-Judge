import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 05.02.2016.
 */
public class URI_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        for (int i = 1; i <= testCases; i++){
            int temp;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 > num2 ){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            int num1Sum = 0;
            for (int j = (num1 + 1); j < num2; j++) {
                if (j % 2 != 0) {
                    num1Sum = num1Sum + j;
                }
            }
            System.out.println(num1Sum);
        }
    }
}
