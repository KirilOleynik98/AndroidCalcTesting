package utils;

import static org.testng.Assert.assertTrue;
import java.io.File;

public class Util {

    public static String getAbsolutePath(String filePath) {
        File file = new File(filePath);
        assertTrue(file.exists(), filePath + " not found");
        return file.getAbsolutePath();
    }
}
