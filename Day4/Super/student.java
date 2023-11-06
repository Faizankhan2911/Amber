package Super;

public class student extends person {
    String name = "Faizan";
    String course = "Java";

    student(){
        super();
        System.out.println(name + " " + course);
    }

    public void display(){
        super.display();
        System.out.println(super.uid + " " + super.city);
    } 
    
}
