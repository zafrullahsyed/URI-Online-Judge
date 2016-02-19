import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numX = sc.nextInt();
        int numY = sc.nextInt();

        while (numX != 0 && numY != 0) {
            if (numX > 0 && numY > 0) {
                System.out.println("primeiro");
            } else if (numX < 0 && numY > 0) {
                System.out.println("segundo");
            } else if (numX < 0 && numY < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            numX = sc.nextInt();
            numY = sc.nextInt();
        }
        if (numX == 0 || numY == 0) {
            return;
        }
    }
}
