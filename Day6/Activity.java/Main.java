import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int option;
        do{
        System.out.println("Enter Option:");
        System.out.println("1-add");
        System.out.println("2-Subtract");
        System.out.println("3-Multiply");
        System.out.println("4-Odd/even");
        System.out.println("5-Exit");
        option = sc.nextInt();
        
        switch (option) {
            case 1:
            System.out.println("enter the Numbers to add");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int add = a+b;
                System.out.println(add);
                break;
            case 2:
                System.out.println("enter the numbers to subtarct");
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int sub = a1-b1;
                System.out.println(sub);
                break;
            case 3:
                System.out.println("enter the numbers to multiply");
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int mul = a2*b2;
                System.out.println(mul);
                break;
            case 4:
                System.out.println("enter the number");
                int a3 =sc.nextInt();
                if (a3 % 2 == 0) {
                    System.out.println("number is even");
                }else{
                    System.out.println("number is out");
                }
                break;
            case 5:
                System.out.println("Program Terminated");
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        }while(option !=5);

    
        
               
    }
    
}
