public class BarkingDog {
    /*public static void main(String[] args){
       boolean barking=false;
       int hourOfDay=5;
       boolean shouldWakeUp=shouldWakeUp(barking,hourOfDay);
       System.out.println("Should dog bark ? = "+shouldWakeUp);
    }*/
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8) || hourOfDay == 23)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
