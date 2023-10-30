import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println(num+ " not a prime number");
        }else{
            System.out.println(num+ "its a prime number ");
        }
    }
}
