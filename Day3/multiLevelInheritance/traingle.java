package Day3.multiLevelInheritance;

public class traingle extends shape{
    public void Area(double b,double h){        
        double area  = 0.5*(b*h);
        System.out.println("Area of traingle = " +area);
    }
}
