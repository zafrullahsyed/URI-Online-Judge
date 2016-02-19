import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 29.01.2016.
 */
public class URI_1066 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int evenCount = 0, oddCount = 0, posCount = 0, negCount = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (array[i] > 0) {
                posCount++;
            } else if (array[i] < 0) {
                negCount++;
            }
        }
        System.out.println(evenCount + " " + "valor(es) par(es)");
        System.out.println(oddCount + " " + "valor(es) impar(es)");
        System.out.println(posCount + " " + "valor(es) positivo(s)");
        System.out.println(negCount + " " + "valor(es) negativo(s)");


    }
}
