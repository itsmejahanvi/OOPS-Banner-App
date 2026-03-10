public class prg5 {

    public static void main(String[] args) {
        printBanner();   // method call
    }

    public static void printBanner() {

        String[] banner = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        for(String line : banner) {
            System.out.println(line);
        }
    }
}