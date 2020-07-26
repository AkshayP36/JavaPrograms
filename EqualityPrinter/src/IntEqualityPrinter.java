public class IntEqualityPrinter {
    /*public static void main(String[] args){
       printEqual(1,1,1);
    }*/
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0)
            System.out.println("Invalid Values");

        else if (a == b && b== c)
            System.out.println("All numbers are equal");
        else if(a !=b && b!=c && a!=c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");

}
}