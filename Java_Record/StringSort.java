import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[n];
        for (int i=0;i<n;i++) {
            System.out.print("Enter string " +(i+1)+": ");
            arr[i] = scanner.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array of strings:");
        for (String str : arr) {
            System.out.println(str);
        }

        scanner.close();
    }
}
