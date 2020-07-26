public class Main {
    public static void main(String[] args){
        String value = "2020";
        System.out.println("Value as a string = "+value);
        int number = Integer.parseInt(value);
        System.out.println("value as a Integer number = " + number);
        double doubleNumber = Double.parseDouble(value);
        System.out.println("value as a Double number = "+doubleNumber);
        long longNumber = Long.parseLong(value);
        System.out.println("value as a long = "+longNumber);
    }
}
