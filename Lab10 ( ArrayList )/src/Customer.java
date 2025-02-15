import java.util.ArrayList ;
public class Customer {
    private String firstName ;
    private String lastName ;
    private ArrayList<Account> acct ;
    private int numOfAccount ;
    public Customer(){
        this("", "") ;
    }
    public Customer(String firstName, String lastName){
        this.acct = new ArrayList<Account>() ;
        this.firstName = firstName ;
        this.lastName = lastName ;
    }
    public void setFirstName(String firstName){ this.firstName = firstName ; }
    public String getFirstName(){ return firstName ; }
    public void setLastName(String lastName){ this.lastName = lastName ; }
    public String getLastName(){ return this.lastName ; }
    public void addAccount(Account acct){
        this.acct.add(acct) ;
        this.numOfAccount = this.acct.size() ;
    }
    public Account getAccount(int index){ return this.acct.get(index) ; }
    public int getNumOfAccount(){ return this.numOfAccount ; }
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " have " + this.numOfAccount + " Account" ;
    }
    public boolean equals(Customer c){ return c.getFirstName().equals(firstName) &&
            c.getLastName().equals(lastName) ;}
}
 