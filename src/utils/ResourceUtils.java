package utils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResourceUtils {

    public static String getResourcePath(String resourceName) {
        Path resourceDirectory = Paths.get("resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        return absolutePath + "/" + resourceName;
    }

}
