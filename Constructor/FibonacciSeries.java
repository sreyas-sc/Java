import java.util.Scanner;

public class FibonacciSeries {
    private int n;

    public FibonacciSeries(int n) {
        this.n = n;
    }

    public void printSeries() {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci series upto " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms to print in Fibonacci series: ");
        int n = input.nextInt();
        FibonacciSeries fib = new FibonacciSeries(n);
        fib.printSeries();
    }
}