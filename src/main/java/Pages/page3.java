package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page3 {


    public static WebElement element = null;

    public static WebElement page_4(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"dealsGridLinkAnchor\"]/div/div[3]/div/ul/li[5]/a"));
        return element;
    }
}
