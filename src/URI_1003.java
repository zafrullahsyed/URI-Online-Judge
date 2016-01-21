import java.util.Scanner;

public class URI_1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter A");
        System.out.println("Enter B");

        int A = input.nextInt();
        int B = input.nextInt();

        int SOMA = A + B;
        System.out.println("SOMA" + " " + "=" + " " + SOMA);
    }
}
