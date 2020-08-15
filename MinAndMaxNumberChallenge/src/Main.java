import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
       // int min=2147483647, max=-2147483648; //Assigning Int limits
         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        //boolean first=true;

        while(true){
            System.out.println("Enter number: ");
            boolean isInt= scanner.hasNextInt();

            if(isInt){
                int number = scanner.nextInt();

                /*if(first){
                    min = max=number;
                    first=false;
                }*/

                if(number>max)
                    max=number;
                if(number<min)
                    min=number;
            }
            else
                break;

            scanner.nextLine();
        }
        scanner.close();
        System.out.println("min = "+min+" & max = "+max);
    }
}
