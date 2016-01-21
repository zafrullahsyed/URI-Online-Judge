import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ZafrullahSyed on 21.01.2016.
 */
public class URI_1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int empNum = sc.nextInt();
        int empHours = sc.nextInt();
        float empWage = sc.nextFloat();

        float SALARY = empHours * empWage;

        DecimalFormat df = new DecimalFormat("####.00");

        System.out.println("NUMBER" + " " + "=" + " " + empNum);
        System.out.println("SALARY" + " " + "=" + " " + "U$" + " " + df.format(SALARY));
    }
}
