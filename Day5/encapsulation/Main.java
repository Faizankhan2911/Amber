package Day5.encapsulation;

public class Main {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.name="Faizan";
		e1.deptname="java";
		e1.location="Banglore";
		e1.setEmpid(77885);
		System.out.println(e1.name);
		System.out.println(e1.deptname);
		System.out.println(e1.location);
		System.out.println(e1.getEmpid());

	}

    
}
