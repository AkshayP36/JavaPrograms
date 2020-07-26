public class Main {
    public static void main(String[] args){
        int minutes=-23;
        int seconds=0;
        getDurationString(minutes,seconds);
    }
    public static void getDurationString(int minutes, int seconds){
        if((minutes<=0)  || (seconds<=0 && seconds >=59))
            System.out.println("Invalid value");
        else {
            int hours = minutes / 60;
            minutes = minutes % 60;
            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        }
    }
}
