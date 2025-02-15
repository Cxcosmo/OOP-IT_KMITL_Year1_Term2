public class Seller extends Employee {
    public Food sell(Employee e){
        Food f = new Food();
        if (e.getWallet().getBalance() >= f.getPrice()){
            super.getWallet().setBalance(super.getWallet().getBalance() + f.getPrice()) ;
            e.getWallet().setBalance(e.getWallet().getBalance() - f.getPrice()) ;
            return f ;
        }
        System.out.println("Your money is not enough");
        return null;
    }
}
