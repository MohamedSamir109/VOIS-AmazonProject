package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class firstItemPage {

    private static WebElement element = null;

    public static void main(String[] args) {
    }

    public static WebElement button_AddToCart(WebDriver driver){

        element = driver.findElement(By.name("submit.add-to-cart"));
        return element;
    }
}
