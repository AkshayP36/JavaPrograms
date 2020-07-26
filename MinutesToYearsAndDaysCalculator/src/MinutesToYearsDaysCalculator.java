public class MinutesToYearsDaysCalculator {
    /*public static void main(String[] args){
        long minutes = 561600;
        printYearsAndDays(minutes);

    }*/
    public static void printYearsAndDays(long minutes){
    if (minutes<0){
        System.out.println("Invalid Value");
    }
    else{
        long days = minutes/1440l;
        long years = days/365l;
        days = days%365;
        System.out.println(minutes +" min = "+years+" y and "+days+" d");
    }
    }

}
