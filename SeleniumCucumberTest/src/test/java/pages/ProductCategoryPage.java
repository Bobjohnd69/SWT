package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage {
    public static String productHeadingXpath = "//*[@id=\"ShoeType\"]";
    public static String productButtonXpath = "/html/body/div[3]/div/div[1]/button";

    public static String visibilityProductCategory(){
        String actualProductCategory = driver.findElement(By.xpath(productHeadingXpath)).getText();
        return actualProductCategory;
    }

    public static void clickProductCategory(){
        driver.findElement(By.xpath(productHeadingXpath)).click();
    }
}
