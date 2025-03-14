public class Plane extends Vehicle implements Flyable{
    private String airline ;
    private String boeing ;
    private static final int MAX_FLYER = 2;
    public Plane(){
        this(0.0, "", "") ;
    }
    public Plane(double fuel, String airline, String boeing){
        super(fuel) ;
        this.airline = airline ;
        this.boeing = boeing ;
    }
    public String getAirline(){ return this.airline ; }
    public String getBoeing(){ return this.boeing ; }
    public void setAirline(String airline){ this.airline = airline ; }
    public void setBoeing(String boeing){ this.boeing = boeing ; }
    @Override
    public void fly(){
        if (super.getFuel() >= 20){
            System.out.println("Plane Fly");
            super.setFuel(super.getFuel() - 20) ;
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void honk(){
        System.out.println("Weeeeeee");
    }
    @Override
    public void landing(){
        if (super.getFuel() >= 10){
            System.out.println("Plane Already to Landing");
            super.setFuel(super.getFuel() - 10) ;
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void startEngine(){
        if (super.getFuel() >= 20){
            System.out.println("Plane’s Engine starts");
            super.setFuel(super.getFuel() - 20) ;
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Plane’s Engine stops");
    }
    @Override
    public void takeOff() {
        if (super.getFuel() >= 10){
            System.out.println("Plane Already to Take Off");
            super.setFuel(super.getFuel() - 10) ;
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
}
