package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class carAccessoriesPage {

    private static WebElement element = null;

    public static void main(String[] args) {
    }

    public static WebElement firstElement(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/span"));
        return element;
    }
}
