import java.util.Scanner;

public class Amstrong {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    int count = 0;
    int temp = number;
    int sum = 0;

    while (temp != 0) {
      temp /= 10;
      count++;
    }

    temp = number;
    while (temp != 0) {
      int digit = temp % 10;
      sum += Math.pow(digit, count);
      temp /= 10;
    }

    if (number == sum) {
      System.out.println(number + " is an Armstrong number.");
    } else {
      System.out.println(number + " is not an Armstrong number.");
    }
  }
}
