package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ShoePage {
    public static String addXpath = "/html/body/div[2]/table/tbody/tr[1]/td[6]/button";

    public static void clickAddToCart(){
        driver.findElement(By.xpath(addXpath)).click();
    }
}
