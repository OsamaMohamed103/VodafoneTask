package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsOfPages {
    public WebElement get_language_locator(WebDriver drv1) {
        return drv1.findElement(By.className("lang"));
    }

    public WebElement get_brand_locator(WebDriver drv1) {
        return drv1.findElement(By.xpath("/html/body/app-root/div/app-notfound-page/div/app-brand/div/div/div[1]/ul/li[5]/a/div/img"));
    }

    public WebElement get_iphone_locator(WebDriver drv1) {
        return drv1.findElement(By.xpath("/html/body/app-root/div/app-shop-by-brand/div/div/div[2]/div/div[3]/div/div/div[1]/div[1]/div/ul/li[12]/a/div/div[3]/a/span"));
    }

    public WebElement proceed_to_checkout_loc(WebDriver drv1) {
        return drv1.findElement(By.xpath("/html/body/app-root/div/app-shoping-cart/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/button"));
    }

    public WebElement select_deliver_to_myaddress(WebDriver drv1) {
        return drv1.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[1]/div[1]/div[1]"));
    }

    public WebElement add_address_details(WebDriver drv1) {
        return drv1.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[1]/div[1]/div/div[1]/div/input"));

    }

//    public WebElement cont_btn_loc(WebDriver drv1) {
//        return drv1.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[1]/div[3]/div/div[2]/div[2]/form/div[3]/button"));
//    }


    public WebElement full_name_loce(WebDriver drv1) {
        return drv1.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[1]/div[1]/input"));

    }

    public WebElement cont_2_loc(WebDriver drv1) {
        return drv1.findElement(By.id("shippingAddressContinue"));
    }

    public WebElement invalidation_loc(WebDriver drv1) {
        return drv1.findElement(By.xpath("/html/body/app-root/div/app-checkout-page/div/div/div[3]/div/div/div[2]/div[2]/form/div/div/div[1]/div[1]/app-alert/div/div/div/div[2]/div/div/div"));

    }
}




