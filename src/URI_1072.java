import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 04.02.2016.
 */
public class URI_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];
        int in = 0, out = 0;

        if (num < 10000) {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
                if (array[i] >= 10 && array[i] <= 20) {
                    in++;
                } else {
                    out++;
                }
            }
            System.out.println(in + " in" + "\n" + +out + " out");
        }
    }
}
