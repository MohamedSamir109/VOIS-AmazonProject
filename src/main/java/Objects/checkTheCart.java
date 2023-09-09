package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkTheCart {

    WebDriver driver = null;


    By text_CaptchPass = By.xpath("/html/body/div/div[3]/a[1]");

    By textbox_Search = By.xpath("//*[@id=\"twotabsearchtextbox\"]");

    By button_Search = By.id("nav-search-submit-button");

    By firstElement = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div");

    By button_AddToCart = By.name("submit.add-to-cart");

    By button_GoToCart = By.xpath("//*[@id=\"sw-gtc\"]/span/a");

    By Element1 = By.xpath(" //*[@id=\"activeCartViewForm\"]");



    public checkTheCart(WebDriver driver) {

        this.driver = driver;
    }


    public void setCaptchaPass() {

        driver.findElement(text_CaptchPass).click();
    }


    public void setTextbox_Search(String search) {

        driver.findElement(textbox_Search).sendKeys(search);
    }


    public void setButton_Search() {

        driver.findElement(button_Search).click();
    }


    public void setFirstElement() {

        driver.findElement(firstElement).click();
    }


    public void setButton_AddToCart() {

        driver.findElement(button_AddToCart).click();
    }



    public void setButton_GoToCart() {

        driver.findElement(button_GoToCart).click();
    }


    public void checkElement() {

        boolean isDisplayed = driver.findElement(Element1).isDisplayed();
        if (isDisplayed){
            System.out.println("The Element is added successfully to the cart");
        }
    }
}
