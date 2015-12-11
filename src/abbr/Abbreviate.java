package abbr;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        // TODO: Write this method.


   string = string.replaceAll("e","");
    string =string.replaceAll("o","");
        string =string.replaceAll("u","");
        string =string.replaceAll("i","");
        string =string.replaceAll("a","");
        string = string.replaceAll("E","");
        string =string.replaceAll("O","");
        string =string.replaceAll("U","");
        string =string.replaceAll("I","");
        string =string.replaceAll("A","");

        return string;
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}
