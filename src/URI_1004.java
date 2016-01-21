import java.util.Scanner;

public class URI_1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ENzter A");
        System.out.println("Enter B");
        int A = input.nextInt();
        int B = input.nextInt();

        int PROD = A * B;
        System.out.println("PROD" + " " + "=" + " " + PROD );
    }
}
