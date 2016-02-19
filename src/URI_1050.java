import java.util.*;

/**
 * Created by ${ZafrullahSyed} on 25.01.2016.
 */
public class URI_1050 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        // String val;
        HashMap hm = new HashMap();
        hm.put(61, "Brasilia");
        hm.put(71, "Salvador");
        hm.put(11, "Sao Paulo");
        hm.put(21, "Rio de Janeiro");
        hm.put(32, "Juiz de Fora");
        hm.put(19, "Campinas");
        hm.put(27, "Vitoria");
        hm.put(31, "Belo Horizonte");

        String val = (String) hm.get(key);
        if (val != null) {
            System.out.println(val);
        } else {
            System.out.println("DDD nao cadastrado");
        }

    }
}
