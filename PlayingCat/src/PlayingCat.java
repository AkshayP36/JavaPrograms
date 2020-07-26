public class PlayingCat {
    /*public static void main(String[] args){
      boolean summer=true;
      int temperature = 10;
      boolean isCatPlaying= isCatPlaying(summer,temperature);
        System.out.println("out = "+isCatPlaying);
    }*/
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature >=25 && temperature<=45){
            if (summer == true){
                return true;
                }
            else if(temperature>=25 && temperature<=35)
                return true;
            else return false;
        }
        else return false;

    }
}
