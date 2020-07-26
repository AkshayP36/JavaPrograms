public class Main {
    public static void main(String[] args){
    int value =3;
    /*if (value==1)
        System.out.println("value is 1");
    else if (value ==2)
        System.out.println("value is 2");
    else
        System.out.println("value is neither 1 nor 2");
    // switch statement*/

        switch (value){

            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:case 4: case 5:
                System.out.println("value is this way");
                System.out.println("actual value is = "+value);
                break;
            default:
                System.out.println("neither 1 nor 2");
                break;
        }
   }

}
