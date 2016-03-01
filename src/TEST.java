import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ${ZafrullahSyed} on 03.02.2016.
 */
public class TEST {
    public static void main1(String[] args) {
        Locale.setDefault(Locale.US);


        Scanner sc = new Scanner(System.in);
        String input = sc.next();


       File file = new File("C:\\Users\\Administrator\\Desktop\\Interview\\testFolder");
        for (int i = 1; i <= 100 ; i++){
            File f1 = new File(file.getPath() + "\\abc" + i);

            f1.mkdir();

            for (int j = 101; j <= 200; j++){
            File f2 = new File(f1.getPath() + "\\uvw" + j);
            f2.mkdir();
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\Interview\\testFolder");
        FilenameFilter fr = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.equals("abc55")){
                    return true;
                }else {
                    return false;
                }
            }
        };
        for (String str : file.list(fr) ){
            System.out.println(str);
        }
    }
}
