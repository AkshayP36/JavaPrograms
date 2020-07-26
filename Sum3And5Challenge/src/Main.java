public class Main {
    public static void main(String[] args){

        int sum=0,counter=0;
        System.out.println("Numbers that meet the conditions = ");
        for(int i=1; i<1001; i++){
            if(counter==5)
                break;
            else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i +", ");
                    sum = sum + i;
                    counter += 1;
                }
            }
        System.out.println("\nthe sum of top 5 numbers = "+sum);
        }

}

