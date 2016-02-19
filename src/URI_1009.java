import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String empName = sc.nextLine();
        double empSalary = sc.nextDouble();
        double empBonus = sc.nextDouble();

        double totalSalary = empSalary + (empBonus * 0.15);

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("TOTAL = R$" + " " + df.format(totalSalary));
    }
}
