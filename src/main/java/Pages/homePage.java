package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    private static WebElement element = null;


    public static WebElement textBox_Search(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        return element;
    }


    public static WebElement button_Search(WebDriver driver){

        element = driver.findElement(By.id("nav-search-submit-button"));

        return element;
    }


    public static WebElement button_Popup(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/div/div/div[3]/span[1]/span"));
        return element;
    }


    public static WebElement button_TodayDeals(WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("By button_TodayDeals = By.xpath(\"//*[@id=\\\"nav-xshop\\\"]/a[1]\");"));
        return element;
    }
}
