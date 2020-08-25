public class Main {
    public static void main(String[] args){
        int[] myarray = new int[] {20,37,20,21};
        int n=2;
        myarray = deleteNth(myarray,n);
        System.out.println(myarray.toString());
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        int counter=0;
        while(maxOccurrences!=counter){
            for(int i=0; i<elements.length; i++){
                for(int j=0; j<elements.length; j++){
                    if(elements[i]==elements[j])
                        counter++;
                    if(maxOccurrences==counter)
                        elements.toString().re
                }
            }
        }


        return null;
    }
}
