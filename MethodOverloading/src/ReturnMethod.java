public class ReturnMethod {
    public static void main(String[] args){
        int a = returnCall(-8);
        System.out.println("Return call = "+a);
    }
    public static int returnCall(int call){
        if(call <=0)
            return 8;

        System.out.println("Still method works");
        return 9;
    }
}
