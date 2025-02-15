public class Ship extends Vehicle implements Floatable{
    public Ship(){ this(0.0) ; }
    public Ship(double fuel){ super(fuel) ; }
    public void move(){
        this.fl0at() ;
    }
    public void move(int distance){
        for(int i = 0 ; i < distance ; i++){
            this.move() ;
            if (super.getFuel() - 50 < 0){
                break ;
            }
        }
    }
    @Override
    public void honk() {
        System.out.println("Shhhhh");
    }
    @Override
    public void startEngine() {
        if (super.getFuel() >= 10){
            System.out.println("Engine starts");
            super.setFuel(super.getFuel() - 10) ;
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine() {
        System.out.println("Engine stops");
    }
    @Override
    public void fl0at() {
        if (super.getFuel() >= 50){
            System.out.println("Ship moves");
            super.setFuel(super.getFuel() - 50) ;
        }
        else {
            System.out.println("Fuel is not enough.");
        }
    }
}
