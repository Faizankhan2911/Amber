class Employee{

    String name;
    int age;
    String dept;
    double salary;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.dept);
        System.out.println(this.salary);
    }


    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Faizan Khan";
        e1.age = 23;
        e1.dept = "Front-end";
        e1.salary = 1300000;
        e1.printinfo();
        
    }
}