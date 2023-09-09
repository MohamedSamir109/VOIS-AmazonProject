package AmazonScenarios;

import Objects.addToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class addingToCart {

    public static WebDriver driver;
    addToCart cart;


    @Given("The user opens the Amazon website")
    public void the_user_opens_the_amazon_website() {

        driver = new FirefoxDriver();
        cart = new addToCart(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().setSize(new Dimension(1024,768));
        driver.get("https://www.amazon.com/");

        try {
            cart.set_CaptchaPass();
        } catch (Exception ex2){
            System.out.println(ex2);;
        }

    }


    @When("Press today's deals button")
    public void press_today_s_deals_button() {

        cart.setButton_todayDeals();
    }


    @And("Choose Headphones")
    public void choose_headphones() {

        cart.setButton_Headphones();
    }

    @And("Choose Grocery")
    public void choose_grocery() {

        cart.setButton_Grocery();
    }

    @And("Choose the required discount")
    public void choose_the_required_discount() {

        cart.setButton_Discount();
    }

    @And("Move to Page3")
    public void move_to_page3() {

        cart.setButton_Page3();
    }

    @And("Press next page")
    public void press_next_page() {

        cart.setButton_Page4();
    }

    @And("Select an item")
    public void select_an_item() {

        cart.setSelect_Item();
    }

    @And("Press add to cart button")
    public void press_add_to_cart_button() {

        cart.setButton_AddToCart();
    }


    @When("Close browser")
    public void close_browser() {

        System.out.println("The item is added successfully to the cart");

        driver.close();

        try {
            driver.quit();
        } catch (Exception ex1){
            System.out.println(ex1);
        }
    }
}
