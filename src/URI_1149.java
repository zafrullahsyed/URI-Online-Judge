import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 05.02.2016.
 */
public class URI_1149 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberIterator = sc.nextInt();
        int totalSum = 0;
        while (numberIterator <= 0){
            numberIterator = sc.nextInt();
        }
        for (int i = 1; i <= numberIterator; i++){
            totalSum = totalSum + number;
            number++;
        }
        System.out.println(totalSum);
    }
}
