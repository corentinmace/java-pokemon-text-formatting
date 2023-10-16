package utils;

public class Format {

    public static String removeExtraSpaces(String str) {
        return str
            .replaceAll("(\\c|\\f|\\r\\n|\\n|\\r)+", "\n")
            .replaceAll("^(\\n|\\s)+|(\\n|\\s)+$", "");
    }

    public static String removeWhitespaces(String str) {
        return str.replaceAll("\\f|\\r\\n|\\n|\\r/m", " ");
    }

}
