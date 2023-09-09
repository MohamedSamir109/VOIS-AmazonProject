package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addToCart {

    WebDriver driver = null;

    By captchaPass = By.xpath("/html/body/div/div[3]/a[1]");

    By Popup = By.xpath("/html/body/div[1]/header/div/div[4]/div[1]/div/div/div[3]/span[1]/span");

    By button_TodayDeals = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");

    By choice_HeadPhones = By.xpath("/html/body/div[1]/div[19]/div/div/div/div[2]/div[2]/span[3]/ul/li[20]/label/input");

    By choice_Grocery = By.xpath("/html/body/div[1]/div[19]/div/div/div/div[2]/div[2]/span[3]/ul/li[19]/label/input");

    By button_Discount = By.linkText("10% off or more");

    By page_3 = By.xpath("//*[@id=\"dealsGridLinkAnchor\"]/div/div[3]/div/ul/li[4]/a");

    By page_4 = By.xpath("//*[@id=\"dealsGridLinkAnchor\"]/div/div[3]/div/ul/li[5]/a");

    By select_Item = By.xpath("/html/body/div[1]/div[19]/div/div/div/div[2]/div[3]/div/div[5]/div/div/a");

    By button_AddToCart = By.name("submit.add-to-cart");

    public addToCart (WebDriver driver){

        this.driver = driver;
    }


    public void set_CaptchaPass(){

        driver.findElement(captchaPass).click();
    }



    public void setButton_todayDeals(){

        driver.findElement(Popup).click();

        driver.findElement(button_TodayDeals).click();

    }


    public void setButton_Headphones(){

        driver.findElement(choice_HeadPhones).click();
    }


    public void setButton_Grocery(){

        driver.findElement(choice_Grocery).click();
    }


    public void setButton_Discount(){

        driver.findElement(button_Discount).click();
    }


    public void setButton_Page3(){

        driver.findElement(page_3).click();
    }


    public void setButton_Page4(){

        driver.findElement(page_4).click();
    }


    public void setSelect_Item(){

        driver.findElement(select_Item).click();
    }


    public void setButton_AddToCart(){

        driver.findElement(button_AddToCart).click();
    }
}
