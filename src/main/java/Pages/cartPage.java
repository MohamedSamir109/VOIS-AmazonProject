package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {

    private static WebElement element = null;

    public static void main(String[] args) {
    }

    public static WebElement Element1(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"activeCartViewForm\"]"));
        return element;
    }
}
