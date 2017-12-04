package Base;

import org.openqa.selenium.WebDriver;

public class BaseUtil {

    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void driver(WebDriver driver) {
        this.driver = driver;
    }
}
