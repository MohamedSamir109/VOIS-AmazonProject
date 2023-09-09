package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class captchaPage {

    private static WebElement element = null;

    public static WebElement captchaPass(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div/div[3]/a[1]"));
        return element;
    }
}
