package StepsDef;

import Locators.LocatorsOfPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class StepsDefinition {
    LocatorsOfPages loc1 = new LocatorsOfPages();

    ChromeDriver driver;
    @Given("user open the website")
    public void user_go_to_websitee() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://eshop.vodafone.com.eg/shop/home");
        driver.manage().window().maximize();
    }

    @And("user select english language")
    public void user_Select_language() {
        loc1.get_language_locator(driver).click();
    }

    @And("go to section Shop By Brand and Select iphone")
    public void user_select_iphone_items() {
        loc1.get_brand_locator(driver).click();
    }

    @And("searching for iphones")
    public void searching_for_iphones() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[2]/button")).click();
        //loc1.get_brand_locator(driver).click();
    }

    @And("select one of the iphones")
    public void selecting_one_of_the_iphones() {
        loc1.get_iphone_locator(driver).click();
    }

    @And("press on add to cart")
    public void press_on_add_tocart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("storageTxt")));
        driver.findElement(By.xpath("/html/body/app-root/div/app-product-details/div/div[1]/div/div[3]/div/div/div[2]/button")).click();
    }


    @And("press on proceed to Checkout")
    public void proceed_to_Checkout_btn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-shoping-cart/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/button")));
        loc1.proceed_to_checkout_loc(driver).click();

    }


    @And("Select delivery Options as Cairo Ain Shams")
    public void selecting_city() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[2]/div[1]/select")));
        Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"headingOne\"]/div[1]/select")));
        sel1.selectByVisibleText("القاهرة");
        sel1 = new Select(driver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[2]/div[2]/select")));
        sel1.selectByVisibleText("عين شمس");
    }

    @And("Select deliver to my address")
    public void press_deliver_to_myaddress() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loc1.select_deliver_to_myaddress(driver)));
        loc1.select_deliver_to_myaddress(driver).click();

    }

    @And("add address details")
    public void add_address_detailss() {
        loc1.add_address_details(driver).sendKeys("Gamal Abdelnasser Street");
        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[2]/div/input")).sendKeys("10");
        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[3]/div/input")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[4]/div/input")).sendKeys("2");
        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[5]/div/input")).sendKeys("AinShams University");
        driver.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[6]/div/input")).sendKeys("10-1-2 MainStreet");
       }
    @And("pressing continue")
       public void press_on_btn_cont(){
            driver.findElement(By.xpath("/html/body/app-root/div/app-cookie/div/div/p/i")).click();
//            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[@type='submit']"))));
              driver.findElement(By.xpath("//button[@class='btn checkout-btn btn-red delievry--btn--checkout']")).click();


 }

@And("leave personal info empty")
    public void leaving_personal_info_empty(){
loc1.full_name_loce(driver).sendKeys("");
}
@And("pressing on continuee")
    public void trying_to_continue(){

loc1.cont_2_loc(driver).click();
}
@Then("erorr message returned from full name filed")
    public void checking_the_invalidation(){
    Assert.assertTrue(loc1.invalidation_loc(driver).isDisplayed());
}

}
