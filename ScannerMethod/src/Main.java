import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur year of birth = ");
        boolean checkNumberValid = scanner.hasNextInt();

        if(checkNumberValid){
            int YOB= scanner.nextInt();
            int age = 2020-YOB;
            scanner.nextLine();

            System.out.println("Enter ur name = ");
            String name = scanner.nextLine();

            if (age>=0 && age<=100)
              System.out.println(name+" , ur name and age i.e "+age+" has been added to the database.");
            else
              System.out.println("Please enter valid year of birth");
        }
        else
            System.out.println("Please enter valid year of birth");

        scanner.close();
    }
}