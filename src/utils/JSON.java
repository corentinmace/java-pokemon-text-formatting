package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;

public class JSON {

    /**
     * Easy way to parse JSON file.
     *
     * @param resourcePath The path to the JSON file.
     * @return The parsed JSON file as a JSONArray.
     * @implNote This method adds the / before the path.
     * You don't need to add it yourself.
     * And it also decodes the path to UTF-8.
     */
    public static JSONArray parseJsonToArray(String resourcePath) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        String path = JSON.class.getResource("/" + resourcePath).getFile();
        String formattedPath = URLDecoder.decode(path, "UTF-8");
        return (JSONArray) parser.parse(new FileReader(formattedPath));
    }

    /**
     * Method to directly get the value of a key from a JSON file.
     *
     * @param index Index of the value.
     * @param arr Array the value is in.
     * @param key Key of the value. (ex: "chars", "lines")
     * @return The value of the key.
     */
    public static Object getKeyFromJSON(Integer index, JSONArray arr, String key) {
        JSONObject obj = (JSONObject) arr.get(index);
        return obj.get("chars");

    }
}
