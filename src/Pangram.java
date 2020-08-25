public class Pangram {
    public static void main(String[] args){
        String value =  "The quick brown fox jumps over the lazy dog";
        value = value.toLowerCase();
        System.out.println(isPangram(value));
    }

    public static boolean isPangram(String value){
        int length = value.length();
        char myValue;
        String comparing  = "abcdefghijklmnopqrstuvwxyz";

        for(int l=0; l<26; l++){
            myValue=comparing.charAt(l);
            for(int i=0; i<length-1; i++){
                if(myValue==value.charAt(i)) {
                    System.out.println(myValue + " = "+comparing.charAt(i));
                    break;
                }
              //  else
                //    return false;

            }

        }

return true;
    }

}
