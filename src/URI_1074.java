import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 04.02.2016.
 */
public class URI_1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];

        if (num < 10000) {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
                if (array[i] == 0) {
                    System.out.println("NULL");
                } else if (array[i] < 0 && array[i] % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else if (array[i] > 0 && array[i] % 2 != 0) {
                    System.out.println("ODD POSITIVE");
                } else if (array[i] < 0 && array[i] % 2 != 0) {
                    System.out.println("ODD NEGATIVE");
                } else if (array[i] > 0 && array[i] % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                }
            }
        }
    }
}
