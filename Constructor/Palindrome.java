import java.util.Scanner;

public class Palindrome {
    String str;

    public Palindrome(String input) {
        this.str = input;
    }

    public boolean isPalindrome() {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        Palindrome palindrome = new Palindrome(input);
        if (palindrome.isPalindrome()) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}