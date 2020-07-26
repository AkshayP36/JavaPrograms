public class Main {
    public static void main(String[] args){
        double amount = 10000;
        for(double i=2; i<9; i+=0.5){
            System.out.println("Interest value on " +amount + " at "+ i+"% interest rate = "+ String.format("%.5f",calculateInterest(amount, i)));
        }
        System.out.println("///////////////////////////////////////");
        for (int f=8; f>1; f-- ){
            System.out.println("The interest amount on "+f+"% interest rate = "+calculateInterest(amount,f));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * interestRate / 100);
    }
}
