public class FirstLastDigitSum {
    /*public static void main(String[] args) {
        int out = sumFirstAndLastDigit(0);
        System.out.println("out = " + out);
    }*/

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0)
            return -1;
        else {
            int firstDigit = 0, lastDigit = 0, counter = 1;
            while (number != 0) {
                firstDigit = number % 10;
                number = number / 10;

                if (counter < 2) {
                    lastDigit = firstDigit;
                    counter = counter + 1;
                    }

            }

            sum = lastDigit + firstDigit;
            return sum;
        }
    }
}
