import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcoholCount = 0, gasolineCount = 0, dieselCount = 0;
        int fuelType = sc.nextInt();

        while (fuelType < 1 || fuelType > 4) {
            fuelType = sc.nextInt();
        }
        while (fuelType != 4) {
            if (fuelType == 1) {
                alcoholCount = alcoholCount + 1;
            } else if (fuelType == 2) {
                gasolineCount = gasolineCount + 1;
            } else if (fuelType == 3) {
                dieselCount = dieselCount + 1;
            }
            fuelType = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool:" + " " + alcoholCount);
        System.out.println("Gasolina:" + " " + gasolineCount);
        System.out.println("Diesel:" + " " + dieselCount);
    }
}
