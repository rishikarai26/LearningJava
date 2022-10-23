package Bank;

class Account{
    public String name;
    // within the the package & outsidethe package through child class
    protected String email;
    
    private String password;
    //getters & setters

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

}

public class Bank {

    // agr hm koi variable ya class ke pehle "public" likh diye to usko koi v khi s v object bnakr access(use kr skta h) 
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }

    
}
