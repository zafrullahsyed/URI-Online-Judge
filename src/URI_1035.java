import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 21.01.2016.
 */
public class URI_1035 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (B > C && D > A && ((C + D) > (A + B)) && C > 0 && A > 0 && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
