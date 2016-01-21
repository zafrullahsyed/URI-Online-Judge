import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1010 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int prod1_code = sc.nextInt();
        int prod1_units = sc.nextInt();
        float prod1_price = sc.nextFloat();

        float prod1 = prod1_units * prod1_price;

        int prod2_code = sc.nextInt();
        int prod2_units = sc.nextInt();
        float prod2_price = sc.nextFloat();

        float prod2 = prod2_units * prod2_price;
        DecimalFormat df = new DecimalFormat("####.00");

        float prodResult = prod1 + prod2;

        System.out.println("VALOR A PAGAR:" + " " + "R$" + " " + df.format(prodResult));
    }
}
