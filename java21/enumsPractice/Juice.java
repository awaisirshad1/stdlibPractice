package java21.enumsPractice;

public enum Juice {
    APPLE("apple", 0),
    CHERRY("cherry", 1),
    CRANBERRY("cranberry", 2),
    GRAPE("grape", 3),
    GRAPEFRUIT("grapefruit", 4),
    GUAVA("guava", 5),
    LEMON("lemon", 6),
    MANGO("mango", 7),
    ORANGE("orange", 8),
    PINEAPPLE("pineapple", 9),
    POMEGRANATE("pomegranate", 10),
    WATERMELON("watermelon", 11);

    private final String juiceString;
    private final Integer juiceNumber;

    Juice(String juiceString, int juiceNumber){
        this.juiceString = juiceString;
        this.juiceNumber = juiceNumber;
    }

    public String getJuiceString(){
        return juiceString;
    }

    public Integer getJuiceNumber(){
        return juiceNumber;
    }

    public String getJuiceAsOneString(){
        return "Name: ["+juiceString+"], Number:["+juiceNumber+"]";
    }
}
