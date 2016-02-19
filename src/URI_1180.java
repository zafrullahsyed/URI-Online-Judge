import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 08.02.2016.
 */
public class URI_1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];
        int lowPosition = 0, pos = 0;

        if (num > 1 && num < 1000) {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
                if (array[i] <= lowPosition) {
                    lowPosition = array[i];
                    pos = i;
                }
            }
            System.out.println("Menor valor: " + lowPosition + "\n" + "Posicao: " + pos);
        }
    }
}
