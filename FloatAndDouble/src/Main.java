public class Main {
    public static void main (String[] args){
        //float
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value = "+myMinFloatValue);
        System.out.println("Max Float Value = "+myMaxFloatValue);

        //Double
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value = "+myMinDoubleValue);
        System.out.println("Max Double Value = " +myMaxDoubleValue);

        //Type cast
        int myIntValue=5;
        float myFloatValue=(float)(2.52);
        double myDoubleValue=5.56d;

        //precision of values
        int myIntPrecision=5/3;
        float myFloatPrecision = 5f/3f;
        double myDoublePrecision = 5d/3d;
        long myLongPrecision = (long)5/3;

        System.out.println("myIntPrecision = "+myIntPrecision);
        System.out.println("myFloatPrecision = "+myFloatPrecision);
        System.out.println("myDoublePrecision = " + myDoublePrecision);
        System.out.println("myLongPrecision = "+myLongPrecision);
    }
}
