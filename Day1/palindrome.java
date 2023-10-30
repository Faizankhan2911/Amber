import java.util.Scanner;
public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int originalNumber = number;
    int reversedNumber = 0;
    while (number != 0) {
      int remainder = number % 10;
      number = number / 10;
      reversedNumber = reversedNumber * 10 + remainder;
    }
    if (originalNumber == reversedNumber) {
      System.out.println(originalNumber +" is a palindrome.");
    } else {
      System.out.println(originalNumber+" is not a palindrome.");
    }
  }
}
