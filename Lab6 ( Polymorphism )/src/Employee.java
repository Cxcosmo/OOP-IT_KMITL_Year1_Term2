public class Employee {
    private static String nationality = "Thai" ;
    private String name ;
    private Wallet wallet ;
    private int energy ;
    public boolean equals(Employee e){ return this.name.equals(e.getName()) ; }
    @Override
    public String toString(){return "My name is " + this.name + ". \nI have "
            + this.energy + " energy left.\nI have a balance of " + this.wallet.getBalance() + " baht." ;}
    public boolean buyFood(Seller s){
        Food f = s.sell(this) ;
        if (f != null){
            this.eat(f) ;
            return true ;
        }
        return false ;
    }
    public void eat(Food f){
        this.energy += f.getEnergy() ;
    }
    public String getName(){ return this.name ; }
    public void setName(String name){ this.name = name ; }
    public Wallet getWallet(){ return this.wallet ; }
    public void setWallet(Wallet wallet){ this.wallet = wallet ; }
    public int getEnergy(){ return this.energy ; }
    public void setEnergy(int energy){ this.energy = energy ; }
    public static String getNationality(){ return Employee.nationality ; }
    public static void setNationality(String nationality){ Employee.nationality = nationality ; }
}
