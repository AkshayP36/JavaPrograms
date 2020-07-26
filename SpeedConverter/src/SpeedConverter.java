public class SpeedConverter {
    public static void main(String[] args) {
        double kilometersPerHour = 5.0;
        long toMilesPerHour = toMilesPerHour(kilometersPerHour);
        printConversion(kilometersPerHour);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        else {
            return (long) (Math.round(kilometersPerHour / 1.609));
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            //long milesPerHour = toMilesPerHour(kilometersPerHour);
            long milesPerHour = (long)(Math.round(kilometersPerHour / 1.609));
            //int milesPerHour2=(int)(milesPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
