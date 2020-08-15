public class Bankaccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    //creating blank constructor
    public Bankaccount() {
        this(132466, 8974, "Robbin-hood Pandey", "tim.buchlka@javaguru.com", 789000);
        System.out.println("under enpty constructor");
    }

    // generating constroctors from intellij


    public Bankaccount(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    //creating constructor with full details
    public Bankaccount(int accountNumber, double balance, String customerName, String email, long phoneNumber) {
        System.out.println("calling constructors with parameters!");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //creating individual getters and setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double deposit) {
        this.balance = balance + deposit;
        System.out.println("Amount added to ur account. The updated balance = " + this.balance);
    }

    public void withdrawl(double withdrawl) {
        if (this.balance - withdrawl < 0)
            System.out.println("Insufficient Balance in the account");
        else {
            this.balance = this.balance - withdrawl;
            System.out.println("Withdrawl of " + withdrawl + " amount processed. Your balance = " + this.balance);
        }
    }


}
