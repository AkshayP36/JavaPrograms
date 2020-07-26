public class Main {
    public static void main(String[] args){

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <=0 || (inches>=0 && inches<=12))
            return -1;
        else {
            double feetToCentimeters= feet * 30.48d;
            double inchesToCentimeters = inches * 2.54d;
            double totalCentimeters = feetToCentimeters+inchesToCentimeters;
            return totalCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<=0)
            return -1;
        else {
            double inchesToFeet = inches * 0.0833333d;
            double calcFeetAndInchesToCentimeters = calcFeetAndInchesToCentimeters(10.5, 12.5);

        }
    }
}
