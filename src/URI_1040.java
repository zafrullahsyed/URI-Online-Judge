import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();


        DecimalFormat df = new DecimalFormat("0.0");
        double avg1 = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;
        System.out.println("Media:" + " " + df.format(avg1));
        if (avg1 >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (avg1 < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (avg1 >= 5.0 && avg1 <= 6.9) {
            System.out.println("Aluno em exame.");
            double N5 = sc.nextDouble();
            System.out.println("Nota do exame:" + " " + df.format(N5));
            avg1 = (avg1 + N5) / 2;
            if (avg1 >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (avg1 <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final:" + " " + avg1);
        }


    }
}
