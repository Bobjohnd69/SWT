package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class HomePage {

    public static String hamburgerMenuXpath = "//*[@id=\"menuToggle\"]/input";
    public static String signInLinkPath = "//*[@id=\"menu\"]/a[2]/li";

    public static void clickHamburgerMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburgerMenuXpath)).click();
    }

    public static void clickSignInLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signInLinkPath)).click();
    }
}
