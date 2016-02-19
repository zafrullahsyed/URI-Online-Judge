import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1173_not_finished {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[10];

        int add = 0;
        if (num < 50) {

            for (int i = 0; i < array.length; i++) {

                array[i] = num * (i + 2);
                System.out.println("N[" + i + "] = " + array[i]);
            }
        }

    }
}
