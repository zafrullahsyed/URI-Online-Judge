import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 11.02.2016.
 */
public class URI_1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long velocity = sc.nextLong();
            long time = sc.nextLong();
            long displacement;
            if (velocity >= -100 && velocity <= 100 && time >= 0 && velocity <= 200) {
                displacement = velocity * time;
                System.out.println(displacement * 2);
            }
        }
    }
}
