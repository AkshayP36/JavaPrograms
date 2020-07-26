public class Main {
    public static void main(String[] args) {
        int totalNumberOfPrime = 0;
        System.out.println("List of prime numbers between 1 to 100 = ");
        for (int i = 0; i < 101; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                totalNumberOfPrime += 1;
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nTotal number of Primes in the range 0 to 100 = " + totalNumberOfPrime);
    }

    public static boolean isPrime ( int number){
            if (number == 0 || number == 1)
                return false;
            else {
                for (int divisor = 2; divisor <= (long) Math.sqrt(number); divisor++) {
                    if (number % divisor == 0)
                        return false;
                }
                return true;
            }
        }
    }

