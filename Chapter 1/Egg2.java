public class Egg2 {
    public static void main(String[] args) {
        printTop();
        printBottom();
        printMiddle();
        printTop();
        printBottom();
        printMiddle();
        printBottom();
        printTop();
        printMiddle();
        printBottom();
    }
    
    public static void printTop() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void printMiddle() {
        System.out.println("-\"-'-\"-'-\"-");
    }

    public static void printBottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
