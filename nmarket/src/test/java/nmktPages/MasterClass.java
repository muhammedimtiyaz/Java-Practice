package nmktPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MasterClass {

    static WebDriver driver;

    public static void openChrome() {

        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");


//      Manual webdriver setup-
//        System.setProperty("webdriver.chrome.driver", "/Users/muhammed/Downloads/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.manage().window().maximize();
    }
}
