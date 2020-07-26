public class Main {
    public static void main(String[] args){
    /*char myChar='B';
    switch(myChar){
        case 'A': case 'B' : case 'C' : case 'D' : case 'E':
            System.out.println("valid value = "+myChar);
            break;
        default:
            System.out.println("value not found!");
            break;
    }*/

    String month = "jaNuary";
    int numberOfDays = numberOfDays(month);
    System.out.println("Number of days in month "+month.toLowerCase()+" = "+numberOfDays);

    }
    public static int numberOfDays(String month){
        int days=0;
        switch(month.toLowerCase()){
            case "january" : case "march" : case "may" : case "july" : case "august" : case "october" : case "december" :
                days= 31;
                break;
            case "april" : case "jun" : case "september" : case "november":
                days= 30;
                break;
            case "february":
                days= 28;
                break;
            default :
                days= -1;
                break;
        }
        return days;
    }

}
