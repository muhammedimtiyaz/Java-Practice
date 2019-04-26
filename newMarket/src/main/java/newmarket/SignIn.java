package newmarket;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SignIn extends Master {

    public static void main(String[] args) {

        checkLoginButton();
        completeSignInForm();
        signOutTest();

    }

    public static void clickLoginInButton() {

        String signInButtonXPath = "//a[contains(text(),'Sign In')]";
        driver.findElement(By.xpath(signInButtonXPath)).click();
    }

    public static boolean checkLoginButton() {

        openChrome();

        clickLoginInButton();

        boolean result;

        try {
            String loginHeaderXPath = "//h1[contains(text(),'Login')]";
            String loginHeader = driver.findElement(By.xpath(loginHeaderXPath)).getText();
            if (loginHeader.contains("Login")) {
                result = true;
                System.out.println("Login landing page test succesful!");
            } else {
                result = false;
                System.out.println("Login landing page test failed.");
            }
        } catch (Exception e) {
            result = false;
            System.out.println(e.getMessage());
        }

        closeBrowser();
        return result;
    }


    public static boolean completeSignInForm() {

        openChrome();

        clickLoginInButton();

        String emailFieldXPath = "//input[@placeholder='Email']";
        String email = "mahfuzrahman@yopmail.com";
        driver.findElement(By.xpath(emailFieldXPath)).sendKeys(email);

        String passwordFieldXPath = "//input[@placeholder='Password']";
        String password = "123456";
        driver.findElement(By.xpath(passwordFieldXPath)).sendKeys(password);

        String loginButtonXPath = "//button[@id='sbtLogin']";
        driver.findElement(By.xpath(loginButtonXPath)).click();

        String fullNameXPath = "//b[contains(text(),'Mahfuz Rahman')]";
        boolean result;
        try{
            String userFullName = driver.findElement(By.xpath(fullNameXPath)).getText();
            if (userFullName.contains("Mahfuz Rahman")) {
                result = true;
                System.out.println("Login successful!");
            } else {
                result = false;
                System.out.println("Login failed.");
            }
        } catch(Exception e) {
            result = false;
            System.out.println(e.getMessage());
        }

//        closeBrowser();
        return result;
    }

    public static boolean signOutTest() {
        completeSignInForm();

        boolean result;
        try {
            String menuButtonXPath = "//button[@id='menu1']";
            driver.findElement(By.xpath(menuButtonXPath)).sendKeys(Keys.RETURN);

            String signOutButtonXPath = "//a[contains(text(),'Logout')]";
            driver.findElement(By.xpath(signOutButtonXPath)).click();

            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains("http://newmarketdhaka.ncryptedprojects.com/sign-in")) {
                result = true;
                System.out.println("Sign out successful");
            } else {
                result = false;
                System.out.println("Sign out failed");
            }
        } catch (Exception e) {
            result = false;
            System.out.println(e.getMessage());
        }
//        closeBrowser();
        return result;
    }

}
