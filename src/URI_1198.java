import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1198 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        while (sc.hasNext()){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            double difference;

                if (num1 > num2){
                    difference = num1 - num2;
                    System.out.println(df.format(difference));
                }else {
                    difference = num2 - num1;
                    System.out.println(df.format(difference));
                }
        }
    }
}
