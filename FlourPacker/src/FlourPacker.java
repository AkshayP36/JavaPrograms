public class FlourPacker {
    public static void main(String[] args) {
        boolean canPack = canPack(4, 18, 19);
        System.out.println("out = " + canPack);

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        else if (bigCount == 0 && smallCount == 0 && goal == 0)
            return true;

        for (int i = 1; i <= bigCount; i++) {
            goal = goal - 5;
            if(goal<=4)
                break;
        }

        if(goal==0)
            return true;
        else if (goal <0)
             return false;
        else {
                for (int i = 1; i <= smallCount; i++) {
                    goal = goal - 1;
                    if(goal<=0)
                        break;
                }
                if (goal==0)
                    return true;
                else
                    return false;

            }
        }
   }


