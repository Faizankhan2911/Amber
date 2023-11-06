package Day5.encap2.ec2;

import Day5.encap2.ec1.Account;

public class Customer extends Account{
    public static void main (String[]args)
	{
		Customer x=new Customer();
		x.address="4th Block Jayanagar Bangalore";
		x.location="Bangalore";
		x.setAcc_no("accno 583456");
		x.setIfsc_code("ifsccode CNRB5233");
		x.amount=240005.54;
		System.out.println(x.address);
		System.out.println(x.location);
		System.out.println(x.amount);
		System.out.println(x.getAcc_no());
		System.out.println(x.getIfsc_code());
		
		
	}

    
}
