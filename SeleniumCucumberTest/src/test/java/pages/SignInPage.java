package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class SignInPage {
    public static String userNameTextXpath = "//*[@id=\"usr\"]";

    public static String passwordTextXpath = "//*[@id=\"pwd\"]";

    public static String loginButtonXpath = "//*[@id=\"second_form\"]/input";


    public static void sendkeysUsername(){
        driver.findElement(By.xpath(userNameTextXpath)).sendKeys("admin");
    }

    public static void sendkeysPassword(){
        driver.findElement(By.xpath(passwordTextXpath)).sendKeys("123");
    }

    public static void clickLoginButton(){
        driver.findElement(By.xpath(loginButtonXpath)).click();
    }
}
