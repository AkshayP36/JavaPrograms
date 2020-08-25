package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car porsche=new Car(); //we have created an object with name car
        Car holden = new Car();

        porsche.setModel("HoDa");
        System.out.println("model is ="+porsche.getModel());
    }
}
