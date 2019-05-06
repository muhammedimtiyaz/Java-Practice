import org.openqa.selenium.By;

public class Registration extends MasterClass{

    public static void main(String[] args) {
        completeRegistration();
    }

    public static void completeRegistration() {

        openChrome();

//        boolean result;
        try {
            Login.clickLoginButton();

            String signUpButtonXPath = "//*[@id=\"jqSignup\"]";

            chromeDriver.findElement(By.xpath(signUpButtonXPath)).click();

            String emailFieldXPath = "//*[@id=\"txtEmail\"]";
            chromeDriver.findElement(By.xpath(emailFieldXPath)).sendKeys("abc@gmail.com");

            String usernameFieldXPath = "//*[@id=\"txtUserName\"]";
            chromeDriver.findElement(By.xpath(usernameFieldXPath)).sendKeys("mimt");

            String passwordFieldXPath = "//*[@id=\"txtPassword\"]";
            chromeDriver.findElement(By.xpath(passwordFieldXPath)).sendKeys("123456");

            String confirmPwFieldXPath = "//*[@id=\"txtCnfPassword\"]";
            chromeDriver.findElement(By.xpath(confirmPwFieldXPath)).sendKeys("123456");

            String firstNameXPath = "//*[@id=\"txtFirstName\"]";
            chromeDriver.findElement(By.xpath(firstNameXPath)).sendKeys("M");

            String lastNameXPath = "//*[@id=\"txtLastName\"]";
            chromeDriver.findElement(By.xpath(lastNameXPath)).sendKeys("I");

            String addressXPath = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input";
            chromeDriver.findElement(By.xpath(addressXPath)).sendKeys("123 H St");

            String createAccountButtonXPath = "//*[@id=\"btnRegister\"]";
            chromeDriver.findElement(By.xpath(createAccountButtonXPath)).click();

            String userAuthXPath = "//*[@id="dLabel"]";



        } catch (Exception e) {
            System.out.println(e.getMessage());
//            result = false;
        }

//        return result;

    }
}
