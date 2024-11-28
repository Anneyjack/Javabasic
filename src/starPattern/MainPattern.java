package starPattern;

public class MainPattern {
    public static void main(String[] args) {
        StarPattern starPattern = new StarPattern();
        System.out.println(" -------RT Angled Triangle");
        starPattern.printRightAngledPattern();
        System.out.println(" INVERTED rT Angled Triangle");
        starPattern.printInvertedRightAngledTrangle();
    }
}
