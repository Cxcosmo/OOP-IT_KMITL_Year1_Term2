public class Account {
    public double balance = 0.0;
    public String name = null ;
    public void deposit(double b) {
        if (b >= 0) {
            balance += b;
        }
        else {
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
    }
    public double withdraw(double b) {
        if (b >= 0) {
            if (balance >= b) {
                balance -= b;
                return b;
            }
            else {
                System.out.println("Your account balance is insufficient.");
                return 0;
            }
        }
        else {
            System.out.println("The balance variable must be greater than or equal to zero.");
            return 0;
        }
    }
    public void showInfo() {
        System.out.println("In "+ name +" account, there is a balance equal to " + balance + " baht. ");
    }
}
