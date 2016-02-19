import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (num1 != num2) {
            if (num1 < num2) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }
        if (num1 == num2) {
            return;
        }
    }
}
