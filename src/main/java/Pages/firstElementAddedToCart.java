package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class firstElementAddedToCart {

    private static WebElement element = null;

    public static void main(String[] args) {
    }

    public static WebElement button_GoToCart(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a"));
        return element;
    }
}
