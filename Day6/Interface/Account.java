package Day6.Interface;

public class Account implements Bank {
     public void credit(){
        System.out.println("500rs credited");
    }
    public void debit(){
        System.out.println("100rs Debited");
    }
    public void loan(){
        System.out.println("Loan department");
    }
    public static void main(String[] args) {
         Account a1 = new Account();
         a1.credit();
         a1.debit();
         a1.loan();
        
    }
    
}
