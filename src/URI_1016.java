import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int xSpeed = 60;
        int ySpeed = 90;
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        ySpeed = time * 2;
        System.out.println(ySpeed + " " + "minutos");

    }
}
