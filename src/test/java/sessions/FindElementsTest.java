package sessions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {
    WebDriver drv1;

    @BeforeEach
    public void start() {
        drv1 = new ChromeDriver();
    }

    @AfterEach
    public void stop() {
        drv1.quit();
    }

    @Test
    void findElement() {
        drv1.get("http://158.101.173.161");
        //drv1.findElement(By.name("query")).sendKeys("Duck");

        drv1.findElement(By.cssSelector(".manufacturers.dropdown")).click();
        //$$(".manufacturers.dropdown")
        //$x("//*[@id='default-menu']/ul[1]/li[3]/a")

        drv1.findElement(By.cssSelector(".account.dropdown")).click();
        //$$(".account.dropdown"))
        //$x("//*[@id='default-menu']/ul[2]/li[2]/a")

        drv1.findElement(By.cssSelector(".product a[title='Yellow Duck']")).click();
        //$$(".product a[title='Yellow Duck']")
        //$x("//*[@id='box-recently-viewed-products']/div/div[2]/a/img")

        //---Popular Products - green duck
        //$$("section#box-popular-products.box a.link[href='http://158.101.173.161/rubber-ducks-c-1/subcategory-c-2/green-duck-p-2']")
        //$x("//*[@id='box-popular-products']/div/article[2]/a/div[1]/img")


        //---Latest Products
        //$$("section#box-latest-products.box a.link[data-name='Red Duck']")
        //$x("//*[@id='box-latest-products']/div/article[3]")

        //---Email Address
        //$$("input.form-control[name=email]")
        //$x("//*[@id='default-menu']/ul[2]/li[2]/ul/li[1]/form/div[1]/div/input")

        //Password
        //$$("input.form-control[name=password]")
        //$x("//*[@id='default-menu']/ul[2]/li[2]/ul/li[1]/form/div[2]/div/input")

        //New customers click here
        //$$("li.account.dropdown.open ul.dropdown-menu li.text-center a[href='http://158.101.173.161/create_account']")
        //$x("//*[@id='default-menu']/ul[2]/li[2]/ul/li[2]/a")
    }
}
