package Day6.MultipleInhertance;

public class customer implements bike {
    public void bikeFetaure(){
        System.out.println("Max speed is 220kmph");
        System.out.println("Bike Comes with a V4 engine");
    }
    public void carFeature(){
        System.out.println("Max speed is 320kmph");
        System.out.println("Car comes with a V8 Engine");
    }
    public static void main(String[] args) {
        customer c1 = new customer();
        c1.bikeFetaure();
        c1.carFeature();
    }
    
}
