package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {


    /*
...Exercise1...
BeforeClass ile driver ı olusturun ve class icinde static yapin
Maximize edin, 15 sn bekletin
http://www.google.com adresine gidin
arama kutusuna "Green Mile" yazip, cikan sonuc sayisini yazdirin
arama kutusuna  "Premonition" yazip, cikan sonuc sayisini yazdirin
arama kutusuna  "The Curious Case of Benjamin Button" yazip, cikan sonuc sayisini yazdirin
AfterClass ile kapatın

 */

    static WebDriver driver;

    @BeforeClass
    public static void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Before
    public void before() {
        driver.get("http://www.google.com");

    }


    @Test
    public void test1() {
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Green Mile" + Keys.ENTER);

    }

    @Test
    public void test2() {
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        aramaKutusu.sendKeys("The Batman" + Keys.ENTER);


    }


    @Test
    public void test3() {
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Green Arrow" + Keys.ENTER);

    }


    @After
    public void tearDown() {


    }

    @AfterClass
    public static void afterClass() {


    }


}
