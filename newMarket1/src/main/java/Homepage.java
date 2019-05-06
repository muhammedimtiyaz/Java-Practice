import org.openqa.selenium.By;

public class Homepage extends MasterClass {

    public static void main(String[] args) {
        System.out.println(checkLoginButton());
    }

    public static boolean checkLoginButton() {
        openChrome();

        try {
            String loginButtonXPath = "//*[@id=\"dLabellogin\"]";
            return chromeDriver.findElement(By.xpath(loginButtonXPath)).isDisplayed();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
