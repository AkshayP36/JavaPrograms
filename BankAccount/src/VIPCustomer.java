public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer(){
        this("BlankConstroctor", 500, "blank@gmail.com");
    }
    public VIPCustomer(String name, double creditLimit){
        this(name, creditLimit, "secondConstroctor@gmail.com");
    }
    public VIPCustomer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
