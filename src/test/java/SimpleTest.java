import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Locale;

public class SimpleTest {

    WebDriver driver;
    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();
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
//
//    @Test
//    void firstTest(){
//        System.out.println("Hello");
//        Assertions.assertEquals(
//                4,
//                5
//        );
//    }
//
//    @Test
//    void firstTest1(){
//        System.out.println("Hello1");
//    }
//
//    @Test
//    void firstTest2(){
//        System.out.println("Hello2");
//    }
//
//    @Test
//    void firstTest3(){
//        System.out.println("Hello3");
//    }
//
//    @Test
//    void firstTest4(){
//        System.out.println("Hello4");
//    }
}
