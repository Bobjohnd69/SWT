package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class SuccessPage {
    public static String successXpath = "/html/body/center[1]/h1";

    public static String visibilitySuccess(){
        String success = driver.findElement(By.xpath(successXpath)).getText();
        return success;
    }
}
