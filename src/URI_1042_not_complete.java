import java.util.Arrays;
import java.util.Scanner;

public class URI_1042_not_complete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayOfNumbers = new int[3];

        for (int i = 0; i < arrayOfNumbers.length; i++){
            arrayOfNumbers[i] = sc.nextInt();
            //int[] sortedArray = new int[arrayOfNumbers.length];
            PrintA(arrayOfNumbers);
            System.out.println(arrayOfNumbers[i]);

        }

    }
    private static void PrintA(int[] a){
        Arrays.sort(a);
        for (int i= 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}