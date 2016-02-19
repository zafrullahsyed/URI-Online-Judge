import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 24.01.2016.
 */
public class URI_1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double aux;
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        if (A > 0 && B > 0 && C > 0) {

            if (A < B) {
                aux = B;
                B = A;
                A = aux;
            }
            if (A < C) {
                aux = C;
                C = A;
                A = aux;
            }
            if (B < C) {
                aux = C;
                C = B;
                B = aux;
            }
            if (A >= B + C) {
                System.out.println("NAO FORMA TRIANGULO");

            } else {
                if ((A * A) == (B * B) + (C * C)) {
                    System.out.println("TRIANGULO RETANGULO");
                }
                if (A * A > B * B + C * C) {
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
                if (A * A < B * B + C * C) {
                    System.out.println("TRIANGULO ACUTANGULO");
                }
                if (A == B && A == C) {
                    System.out.println("TRIANGULO EQUILATERO");
                }
                if (((A == B) && (B != C)) || ((B == C) && (C != A))
                        || ((A == C) && (C != B))) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
    }
}
