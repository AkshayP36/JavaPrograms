public class Main {
    public static void main(String[] args){
        String playerName = "Akshay";
        int playerPosition = 5;
        int playerScore = -10;
        displayHighScorePosition(playerName,playerPosition);
        int scoringPosition = calculatingScorePosition(playerScore);
        System.out.println("Scoring position of player = "+scoringPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName +" managed to get into position "+playerPosition + " on the high score table.");
    }
    public static int calculatingScorePosition(int playerScore){

        //method 1 :
/*        if(playerScore>=1000){
            return 1;
        } else if (playerScore>=500){
            return 2;
        } else if (playerScore>=100){
            return 3;
        }

        return 4;*/

        //Method2:
        int scoringPosition = 4;
        if (playerScore>=1000){
            scoringPosition=1;
        } else if(playerScore >=500){
            scoringPosition=2;
        }else if(playerScore>=100){
            scoringPosition=3;
        }
        return scoringPosition;
    }
}
