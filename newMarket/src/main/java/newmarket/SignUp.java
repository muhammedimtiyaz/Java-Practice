package newmarket;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SignUp extends Master {

    public static void main(String[] args) {

        signUpButtonCheck();
    }

    public static void clickSignUpButton() {
        String SignUpButtonXPath = "//a[contains(text(),'Sign Up')]";
        driver.findElement(By.xpath(SignUpButtonXPath)).click();
    }

    public static boolean signUpButtonCheck() {
        openChrome();
        clickSignUpButton();

        boolean result;
        try {
            String SignUpUrl = driver.getCurrentUrl();
            if (SignUpUrl.contains("http://newmarketdhaka.ncryptedprojects.com/sign-up")) {
                result = true;
                System.out.println("Sign Up Button redirects to sign up url");
            } else {
                result = false;
                System.out.println("Sign Up Button does not redirect to sign up url");
            }
        } catch(Exception e) {
            result = false;
            System.out.println("Sign Up Button does not redirect to sign up url");
        }

        System.out.println(result);
        closeBrowser();
        return result;
    }

    public static boolean completeSignUp() {
        openChrome();
        clickSignUpButton();

        boolean result;
        try {
            String firstNameFieldXPath = "//input[@id='fname']";
            driver.findElement(By.xpath(firstNameFieldXPath)).sendKeys("Md");

            String lastNameFieldXPath = "//input[@placeholder='Last Name*']";
            driver.findElement(By.xpath(lastNameFieldXPath)).sendKeys("A");

            String emailFieldXPath = "//input[@placeholder='Email*']";
            driver.findElement(By.xpath(emailFieldXPath)).sendKeys("A@yahoo.com");

            String mobileFieldXPath = "//input[@id='contact']";
            driver.findElement(By.xpath(mobileFieldXPath)).sendKeys("1234567890");

            String passwordFieldXPath = "//input[@id='password']";
            driver.findElement(By.xpath(passwordFieldXPath)).sendKeys("123456");

            String passwordRecheckFieldXPath = "//input[@placeholder='Confirm Password*']";
            driver.findElement(By.xpath(passwordRecheckFieldXPath)).sendKeys("123456");

            String imageUploadXPath = "//input[@id='profile_img']";
            driver.findElement(By.xpath(imageUploadXPath)).sendKeys("/Users/muhammed/Desktop/Screen Shot 2019-02-06 at 11.55.51 AM");

            String termsRadioBoxXPath = "//label[@for='input_k']";
            driver.findElement(By.xpath(termsRadioBoxXPath)).click();

            String registerButtonXPath = "//button[@id='sbtRegi']";
            driver.findElement(By.xpath(registerButtonXPath)).sendKeys(Keys.RETURN);

            if ()
        } catch(Exception e) {
            result = false;
            System.out.println(e.getMessage());
        }
    }
}
