public class Main {
    public static void main(String[] args) {
        long m=1071225L;

        double temp;
        long cube = getN(m);
        System.out.println("__________________");
        System.out.println("n = "+(cube));
    }

    public static long getN(long m) {

        long n = 1;
        while (m > 0) {

            m =  (long)(m - n*n*n);
            n = n + 1;
            //System.out.println("mk= " + m + "  n= " + n);
            if (m < 0)
            return -1;

        }
        return (long)n-1;
    }
}

