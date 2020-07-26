public class SumOddRange {
    /*public static void main(String[] args){
       int start = 1, end =10;
       int sumOdd = sumOdd(start,end);
        System.out.println("sum of odd numbers = "+sumOdd);
    }*/
    public static boolean isOdd(int number){
        if(number <0)
            return false;
        else {
            if (number%2==0)
                return false;
            else
                return true;
        }
    }
    public static int sumOdd(int start, int end){
        int sum=0;
        boolean isOdd;
        if (end >=start && start >0) {
            for (start=start; start <= end; start++) {
                isOdd = isOdd(start);
                if (isOdd)
                    sum = sum + start;

            }
            return sum;
        }
        else
            return -1;
    }
}
