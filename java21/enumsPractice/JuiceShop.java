package java21.enumsPractice;

public class JuiceShop {
    public static void main(String[] args) {
        Juice[] juices = Juice.values();
        for (Juice juice: juices){
            System.out.println("Printing a juice:");
            printJuiceEntirely(juice);
        }
    }

    static void printJuiceEntirely(Juice juice){
        printIndented("Juice name:["+juice.name()+"]");
        printIndented("Juice ordinal:["+juice.ordinal()+"]");
        printIndented("Juice number:["+juice.getJuiceNumber()+"]");
        printIndented("Juice string:["+juice.getJuiceString()+"]");
    }

    static void printIndented(String msg){
        System.out.println("\t"+msg);
    }
}
