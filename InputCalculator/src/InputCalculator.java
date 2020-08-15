import java.util.Scanner;

public class InputCalculator {
    /*public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }*/
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum=0,counter=1;
        long avg=0;

        while(true){
            boolean isValid=scanner.hasNextInt();
            if(isValid){
                long number=scanner.nextInt();
                sum= Math.round(sum+number);
                //System.out.println("sum = "+sum);
                avg=Math.round(sum/counter);
                //System.out.println("avg = "+avg);
                counter++;
            }
            else break;

            scanner.nextLine();
        }
        int k = (int)(sum);
        System.out.println("SUM = "+k +" AVG = "+avg);
        scanner.close();
    }
}
