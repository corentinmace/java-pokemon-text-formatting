package utils;

public class Format {

    public static String removeExtraSpaces(String str) {
        // Remove consecutive control characters, newlines, and carriage returns
        str = str.replaceAll("(\\c|\\f|\\r\\n|\\n|\\r)+", "\n");
        // Remove leading and trailing spaces and newlines
        str = str.replaceAll("^(\\n|\\s)+|(\\n|\\s)+$", "");
        return str;
    }

    public static String removeWhitespaces(String str) {
        return str.replaceAll("\\f|\\r\\n|\\n|\\r", " ");
    }

    public static String removeMultiSpaces(String str) {
        return str.replaceAll("\\s+", " ");
    }
}
