import java.util.Scanner;

public class URI_1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        for (int i = 0 ; i < inputNumber; i++) {
            System.out.println(i+1 + " " + (int)Math.pow(i+1,2) + " " + (int)Math.pow(i+1,3));
        }
    }
}
