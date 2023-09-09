package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodayDeals {


    public static WebElement element = null;

    public static WebElement choice_HeadPhones(WebDriver driver) {

        element = driver.findElement(By.id("filter-department-172541"));
        return element;

    }


    public static WebElement choice_Grocery(WebDriver driver) {

        element = driver.findElement(By.id("filter-department-16310101"));
        return element;
    }



    public static WebElement button_Discount(WebDriver driver) {

        element = driver.findElement(By.linkText("10% off or more"));
        return element;
    }


    public static WebElement page_3(WebDriver driver) {

        element = driver.findElement(By.xpath("//*[@id=\"dealsGridLinkAnchor\"]/div/div[3]/div/ul/li[4]/a"));
        return element;
    }
}
