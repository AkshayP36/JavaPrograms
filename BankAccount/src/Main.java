public class Main {
    public static void main(String[] args){
        Bankaccount akshayAccount=new Bankaccount();
        akshayAccount.setAccountNumber(2001005040);
        akshayAccount.setBalance(1000000);
        akshayAccount.setCustomerName("Akshay Patil");
        akshayAccount.setEmail("akshay.p94@outlook.com");
        akshayAccount.setPhoneNumber(78945678);

        akshayAccount.withdrawl(50000);
        akshayAccount.deposit(9000000);
        System.out.println(akshayAccount.getCustomerName());

        //
        System.out.println("Tim bhau cha account");
        Bankaccount Tim = new Bankaccount(132466, 8974, "Tim Buchlka", "tim.buchlka@javaguru.com", 789000);
        System.out.println(Tim.getCustomerName());
        Tim.withdrawl(974);

        //
        Bankaccount loyal=new Bankaccount();
        System.out.println(loyal.getCustomerName());
        //

        // testing VIP customer
        VIPCustomer TomCruise = new VIPCustomer();
        System.out.println("Blank constructor "+TomCruise.getName());
        System.out.println("Blank constructor "+TomCruise.getEmailAddress());
        System.out.println("Blank constructor "+TomCruise.getCreditLimit());

        System.out.println("***********************************");
        VIPCustomer Polard = new VIPCustomer("Polard",8000);
        System.out.println("second call "+Polard.getName());
        System.out.println("second call "+Polard.getEmailAddress());
        System.out.println("second call "+Polard.getCreditLimit());

        System.out.println("************************");
        VIPCustomer ViratKohali = new VIPCustomer("Virat Kohali",1000000, "indiancapatain@bcci.com");
        System.out.println("Main constructor "+ViratKohali.getName());
        System.out.println("Main constructor "+ViratKohali.getEmailAddress());
        System.out.println("Main constructor "+ViratKohali.getCreditLimit());
    }
}
