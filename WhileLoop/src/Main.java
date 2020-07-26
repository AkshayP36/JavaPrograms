public class Main {
    public static void main(String[] args){
        int count=0;
        while (count<=5){
            System.out.println("The value of count = "+count);
            count=count+1;
        }
            count = 1;
        do{
            System.out.println("The value of number with do-while = "+count);
            count=count+1;
        } while(count <=10);

        ///////
        int number = 1;
        int maxRange=20;
        System.out.println("Even numbers from "+number + " to "+maxRange+" = ");
        while(number<=maxRange){
            boolean isEvenNumber = isEventNumber(number);
            if(isEvenNumber)
                System.out.print(number+" ");
            number=number+1;
        }
    }
    public static boolean isEventNumber(int number){
        if(number%2==0)
            return true;
        else return false;
    }
}
