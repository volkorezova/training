import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;

public class SimpleTest {

    WebDriver driver;
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();

        //adding capabilities for chrome driver
        ChromeOptions opts = new ChromeOptions();
        opts.setCapability("acceptInsecureCerts", true);

        //usage Command Line Arguments (Options) for start chrome
        opts.addArguments("start-fullscreen");
        //opts.addArguments("start-maximized");
        opts.setExperimentalOption("w3c",false);//switch to JSON wire protocol

        driver = new ChromeDriver(opts);

        System.out.println(((HasCapabilities) driver).getCapabilities());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void firstSeleniumTest(){
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
        Assertions.assertTrue(driver.findElement(By.cssSelector("h3")).getText().toLowerCase().contains("selenium"), "Selenium not found");
    }

//    @BeforeAll
//    static void setUp(){
//        System.out.println("Setup");
//    }
//
//    @AfterAll
//    static void shutDown(){
//        System.out.println("Finished");
//    }

//    @Test
//    void firstTest(){
//        System.out.println("Hello");
//        Assertions.assertEquals(
//                4,
//                5
//        );
//    }

//    @Test
//    void firstTest1(){
//        System.out.println("Hello1");
//    }
//
}
