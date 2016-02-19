import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 04.02.2016.
 */
public class URI_1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();

        if (startTime >= endTime) {
            startTime = 24 - startTime + endTime;
            System.out.println("O JOGO DUROU " + startTime + " HORA(S)");
        } else {
            endTime = endTime - startTime;
            System.out.println("O JOGO DUROU " + endTime + " HORA(S)");
        }
    }
}
