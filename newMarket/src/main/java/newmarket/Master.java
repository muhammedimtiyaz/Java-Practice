package newmarket;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Master {

    static WebDriver driver;

//    public static void main(String[] args) {
//
//
////        openChrome();
////        openOpera();
//
//    }

    public static void openChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://newmarketdhaka.ncryptedprojects.com/?fbclid=IwAR0pWdzp18am6pQH8wBckDDqCT1Jva5Lj0UGJNKRaJWwHG7g-75MZxuabSk");
    }

    public static void openFireFox() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://newmarketdhaka.ncryptedprojects.com/?fbclid=IwAR0pWdzp18am6pQH8wBckDDqCT1Jva5Lj0UGJNKRaJWwHG7g-75MZxuabSk");
    }

    public static void openOpera() {
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        driver.get("http://newmarketdhaka.ncryptedprojects.com/?fbclid=IwAR0pWdzp18am6pQH8wBckDDqCT1Jva5Lj0UGJNKRaJWwHG7g-75MZxuabSk");
    }

    public static void closeBrowser() {
        driver.close();
    }
}
