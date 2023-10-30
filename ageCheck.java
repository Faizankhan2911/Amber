import java.util.Scanner;

public class ageCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int  age = sc.nextInt();
       if (age>= 16 && age<=18) {
        System.out.println("Eligible for Voting");
       }else if(age<= 15){
        System.out.println("not Eligible");
       }else if(age>= 18){
        System.out.println("not eligible");

       }

    }
}
