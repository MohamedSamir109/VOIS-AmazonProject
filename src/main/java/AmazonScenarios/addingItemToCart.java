package AmazonScenarios;

import Objects.checkTheCart;
import fromData.dataSheet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class addingItemToCart {

    public static String input1 = null;

    public static checkTheCart checking = null;

    public static WebDriver driver = null;

    public static dataSheet sheet2 = null;


    @Given("The user opens the Amazon home page")
    public void the_user_opens_the_amazon_home_page() {

        driver = new FirefoxDriver();
        checking = new checkTheCart(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().setSize(new Dimension(1080,768));
        driver.get("https://www.amazon.com/");

        try {
            checking.setCaptchaPass();
        } catch (Exception ex){
            System.out.println(ex);;
        }
    }



    @When("Entering a text car accessories in search box")
    public void entering_a_text_car_accessories_in_search_box() {

        String projectPath = System.getProperty("user.dir");
        sheet2 = new dataSheet(projectPath + "/Data/Amazon Categories.xlsx", "Sheet1");
        input1 = sheet2.getCellData1(1,0);
        checking.setTextbox_Search(input1);

    }

    @And("Pressing search button")
    public void pressing_search_button() {

        checking.setButton_Search();
    }

    @And("Choosing the first item")
    public void choosing_the_first_item() {

        checking.setFirstElement();
    }

    @And("Pressing Add to cart button")
    public void pressing_add_to_cart_button() {

        checking.setButton_AddToCart();
    }

    @And("Pressing GO to cart button")
    public void pressing_go_to_cart_button() {

        checking.setButton_GoToCart();
    }

    @Then("Checking the presence of the item")
    public void checking_the_presence_of_the_item() {

        checking.checkElement();
    }

    @And("Closing browser")
    public void closing_browser() {

        driver.close();

        try {
            driver.quit();
        } catch (Exception ex1){
            System.out.println(ex1);
        }
    }
}
