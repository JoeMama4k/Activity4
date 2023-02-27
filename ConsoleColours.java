package ex1_metodes;

/**
 * @author Joan Carcellé Obradors
 */

public class ConsoleColours {

    // Make the constructor private so the user can't create an object of the class since this is a Util Class For ConsoleColours
    private ConsoleColours(){}

    // Made it so it works with Linux, Windows and Mac
    
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
}

