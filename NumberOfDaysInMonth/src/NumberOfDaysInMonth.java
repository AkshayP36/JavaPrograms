public class NumberOfDaysInMonth {
    /*public static void main(String[] args){
        System.out.println("is leap year = "+ isLeapYear(-1024));
        System.out.println("days in month = "+ getDaysInMonth(1,2020));
    }*/
    public static boolean isLeapYear(int year){
        if (year<=1 || year >=9999)
            return false;
        else{
            if(year%4==0 && year%100!=0)
                return true;
            else if (year%400==0)
                return true;
            else return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if (month <1 || month >12 || year <1 || year >9999){
            return -1;
        }
        else{
            int getDaysInMonth=0;
            boolean isYeapYear = isLeapYear(year);
            if (month == 2 && isYeapYear==true)
                return 29;
            else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        getDaysInMonth = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        getDaysInMonth = 30;
                        break;
                    default:
                        getDaysInMonth = 28;
                        break;
                }
                return getDaysInMonth;
            }
        }
    }
}
