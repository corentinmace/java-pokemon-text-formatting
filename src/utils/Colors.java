package utils;

public class Colors {

    public static String addColorsCodes(String text, String color, Integer gen) {
        String haystack = switch (gen) {
            case 4 -> switch (color) {
                case "red" -> "\\vFF00\\x0001\\x0001INSERTTEXT\\vFF00\\x0001\\x0000";
                case "green" -> "\\\\vFF00\\\\x0001あINSERTTEXT\\\\vFF00\\\\x0001\\\\x0000";
                case "blue" -> "\\\\vFF00\\\\x0001ぁINSERTTEXT\\\\vFF00\\\\x0001\\\\x0000";
                default -> "No valid color given";
            };
            case 5 -> switch (color) {
                case "red" -> "[COLOR(1)]INSERTTEXT[COLOR(0)]";
                case "blue" -> "[COLOR(2)]INSERTTEXT[COLOR(0)]";
                case "yellow" -> "[COLOR(3)]INSERTTEXT[COLOR(0)]";
                case "green" -> "[COLOR(4)]INSERTTEXT[COLOR(0)]";
                case "orange" -> "[COLOR(5)]INSERTTEXT[COLOR(0)]";
                case "pink" -> "[COLOR(6)]INSERTTEXT[COLOR(0)]";
                default -> "No valid color given";
            };
            default -> "No valid generation given";
        };

        return haystack.replace("INSERTTEXT", text);
    }
}
