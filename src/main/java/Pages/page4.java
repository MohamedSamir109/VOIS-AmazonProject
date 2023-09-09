package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page4 {

    public static WebElement element = null;

    public static WebElement select_Item(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div"));
        return element;
    }
}
