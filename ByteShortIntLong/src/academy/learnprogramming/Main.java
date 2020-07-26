package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myMinValue = Integer.MIN_VALUE;
	    int myMaxValue = Integer.MAX_VALUE;
	    System.out.println("Min value = "+myMinValue);
	    System.out.println("Max value = "+myMaxValue);
	    int myOtherRepresentation= 2_147_483_647;
		System.out.println("other representation = "+myOtherRepresentation);

		//Byte code
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte minimum value = "+myMinByteValue);
		System.out.println("Byte maximum value = " + myMaxByteValue);

		// short code
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Min short value = "+myMinShortValue);
		System.out.println("Max Short value = "+myMaxShortValue);

		//long code
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long value min = "+myMinLongValue);
		System.out.println("Long value max = "+myMaxLongValue);


		//difference between max long and max int
		System.out.println("Difference between max long and max int value = "+(myMaxLongValue/myMaxValue));

		//Type casting
        int myIntTotal = myMinValue/2;
        System.out.println("Integer division = "+myIntTotal);
        byte myByteTotal = (byte)(myMinByteValue/2);
        System.out.println("Byte division = "+myByteTotal);
        short myShortTotal = (short)(myMinShortValue/2);
        System.out.println("Short Division = "+myShortTotal);

        //Challenge
        short myShortValue=10;
        byte myByteValue=10;
        int myIntValue=10;
        long myTotal= (long)(50000+10 * (myShortValue+myByteValue+myIntValue));

    }
}
