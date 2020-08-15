public class DiagonalStar {
    /*public static void main(String[] args){
        printSquareStar(8);
    }*/
    public static void printSquareStar(int number){
        if(number<5)
            System.out.println("Invalid Value");
        else {

            int rowCount = number, columnCount = number;
            for(int i=1; i<=rowCount; i++){

                for(int j=1; j<=columnCount; j++){

                    System.out.print("");
                    if(i==1 || i==rowCount || j==1 || j==columnCount || i==j || j==rowCount-i+1)
                        //System.out.print("i="+i+"j="+j);
                        System.out.print("*");
                    else
                        //System.out.print("S"); //s for space
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

    }
}

//