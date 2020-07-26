public class FlourPacker {
    /*public static void main(String[] args){
        boolean canPack = canPack(2,-2,5+6);
        System.out.println("out = "+canPack);

    }*/
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount<0 || smallCount<0 || goal<0)
            return false;
        bigCount=bigCount*5;
        int goalRemainAfterRemovingBigBag = goal-bigCount;
        if(goalRemainAfterRemovingBigBag<0)
            return false;
        int goalRemainAfterRemovingSmallBag = goalRemainAfterRemovingBigBag-smallCount;
        if(goalRemainAfterRemovingSmallBag==-1 || goalRemainAfterRemovingSmallBag==0)
            return true;
        else return false;
    }
}
