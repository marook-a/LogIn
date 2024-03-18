package Common;

import org.openqa.selenium.By;

public class Settings {
    public static String url = "https://staging.sittertree.com/";
    public static String email = "sitter";
    public static String password = "sitter";
    public static String expectedTitle = "Jobs";


    /**
     * To keep the browser after suite
     * if true - browser close
     */
    public static final Boolean HOLD_BROWSER_OPEN = true;
}
