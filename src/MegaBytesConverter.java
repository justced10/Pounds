public class Main {
    public static void main(String[] args) {
        printMegaBytesAndkiloBytes(2500);
        printMegaBytesAndkiloBytes(-1024);
        printMegaBytesAndkiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes >= 0) {
            int mega = kilobytes / 1024;
            int kb = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + " MB and " + kb + " KB");
            String result = String.format("%s MB and %s KB", kilobytes, mega, kb);
            System.out.println(result);
        } else {
            System.out.println("Invalid Value");
        }
    }


}
