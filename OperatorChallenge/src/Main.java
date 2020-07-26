public class Main {
    public static void main(String[] args){
        double firstVariable=20.00;
        double secondVariable=80.00;
        double total = (double)(firstVariable+secondVariable)*100.00;
        double remainderVariable = (double)(total%40.00);
        boolean isRemainderZero = (remainderVariable==0) ? true : false;
        System.out.println(isRemainderZero);
        if(!isRemainderZero){
            System.out.println("Got some remainder");
        }
    }
}
