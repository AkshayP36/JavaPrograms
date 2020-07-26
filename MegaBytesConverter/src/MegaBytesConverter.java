public class MegaBytesConverter {
    /*public static void main(String[] args){
        int kilobytes=5000;
        printMegaBytesAndKiloBytes(kilobytes);
    }*/

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes<0){
            System.out.println("Invalid Value");
        }else {
            int megabyte = kilobytes / 1024;
            int remainingKilobyte = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + megabyte + " MB and " + remainingKilobyte + " KB");
        }
    }
}
