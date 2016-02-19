import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 04.02.2016.
 */
public class URI_1052 {

    private static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num >= 1 && num <= 12) {
            num = num - 1;
            System.out.println(months[num]);
        }


    }
}
