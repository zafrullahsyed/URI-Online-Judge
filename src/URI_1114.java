import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 28.01.2016.
 */
public class URI_1114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha Invalida");
            password = sc.nextInt();
        }
        if (password == 2002) {
            System.out.println("Acesso Permitido");
        }

    }
}
