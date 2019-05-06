import org.openqa.selenium.By;

public class Login extends MasterClass{

    public static void clickLoginButton() {
        String loginButtonXPath = "//*[@id=\"dLabellogin\"]";
        chromeDriver.findElement(By.xpath(loginButtonXPath)).click();
    }
}
