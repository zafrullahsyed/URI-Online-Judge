import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 05.02.2016.
 */
public class URI_1149_not_finished {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int output = 0, addition;
        int valueA = sc.nextInt();
        int valueN = sc.nextInt();

        while (valueN < 0 || valueN == 0) {
            valueN = sc.nextInt();
        }

        // buffer = valueA;
        for (int count = 1; count <= valueN; count++) {
            valueA = valueA + output;
            output++;
            System.out.println("value A " + valueA);
        }
        System.out.println(valueA);
        /*
        if (count <= valueN){
            valueA = valueA + output;
            System.out.println("value A" + valueA);
            count++;
            valueA++;
        }
        System.out.println(valueA);
        */
    }
}
