import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        float Y = sc.nextFloat();
        DecimalFormat df = new DecimalFormat("#.00");
        switch (X) {
            case 1: {
                double Total = Y * 4;
                System.out.println("Total: R$" + " " + df.format(Total));
                break;
            }
            case 2: {
                double Total = Y * 4.50;
                System.out.println("Total: R$" + " " + df.format(Total));
                break;
            }
            case 3: {
                double Total = Y * 5;
                System.out.println("Total: R$" + " " + df.format(Total));
                break;
            }
            case 4: {
                double Total = Y * 2;
                System.out.println("Total: R$" + " " + df.format(Total));
                break;
            }
            case 5: {
                double Total = Y * 1.50;
                System.out.println("Total: R$" + " " + df.format(Total));
                break;
            }
        }

    }
}
