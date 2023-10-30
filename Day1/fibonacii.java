import java.util.Scanner;
public class fibonacii {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int n = scanner.nextInt();
    System.out.print("The Fibonacci series is: ");
    int[] fib = new int[n];
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i < n; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    for (int i = 0; i < n; i++) {
      System.out.print(fib[i] + " ");
    }
  }
}