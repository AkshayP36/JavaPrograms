public class Main {

    public static void main(String[] args){
        int finalScore=0;
        finalScore = calculateScore(true,800,5,100);
        System.out.println("Your final score was "+finalScore);
        finalScore= calculateScore(true,10000,8,200);
        System.out.println("Your final score was "+finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore=score +levelCompleted*bonus;
            return finalScore;
        }
        return -1;
    }

}
