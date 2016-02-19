import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 03.02.2016.
 */
public class TEST {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int fuelType = sc.nextInt();
        while (fuelType != 4) {
            switch (fuelType) {
                case 1:
                    System.out.println("Alcohol");
                case 2:
                    System.out.println("Diesel");
                case 3:
                    System.out.println("Petrol");
                case 4:
                    break;

            }
        }
    }
}
