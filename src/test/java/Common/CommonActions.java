package Common;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonActions {

    public static WebDriver CreateDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
