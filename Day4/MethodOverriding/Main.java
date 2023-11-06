package MethodOverriding;

public class Main {
      public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.printInfo();
        Bank b2 = new SBI();
        b2.printInfo();
        Bank b3 = new HDFC1();
        b3.printInfo();
        Bank b4 = new ICICI();
        b4.printInfo();
    }
}
