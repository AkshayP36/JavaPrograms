package academy.learnprogramming;

public class Car {
    //variables are state component of car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //creating methods
    public void setModel(String model){
        String validModel=model.toLowerCase();
        if(validModel.equals("porsches") || validModel.equals("honda"))
            this.model = model;
        else
            this.model="Unknown";

    }
    public String getModel(){
        return this.model;
    }
}
