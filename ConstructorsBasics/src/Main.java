public class Main{
    public static void main(String[] args){
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Puppy",8,20,2,3,1,32,"Long silky");

        dog.eat();
        System.out.println("***************");
        dog.walk();
        System.out.println("******************************");
        dog.run();
    }
}
