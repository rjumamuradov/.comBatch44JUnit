package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01_JUnit {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//div[text()='I agree']")).click();

        String actualSayfaTitle= driver.getTitle();
        String expectedTitle="Google";
    if (actualSayfaTitle.contains(expectedTitle)) System.out.println("Google kelime iceriyo tes PASS");
    else System.out.println("Google icermiyor FAILED "+actualSayfaTitle+" olmasi gerekiyo");

        WebElement aramakutusu= driver.findElement(By.xpath("//input[@name='q']"));
    aramakutusu.sendKeys("Nutella"+ Keys.ENTER);
   // driver.navigate().refresh();
    WebElement aramaSonucu=driver.findElement(By.xpath("//div[@id='result-stats']"));
        //div[@id='result-stats']

        System.out.println(aramaSonucu.getText());
        String sonucSayisi= aramaSonucu.getText();
        String sonucKelimeleri[]=sonucSayisi.split(" ");
        String sonucSayisi1=sonucKelimeleri[1]+sonucKelimeleri[2]+sonucKelimeleri[3];
        int sonuc=Integer.parseInt(sonucSayisi1);
        System.out.println(sonuc);
        System.out.println(Arrays.toString(sonucKelimeleri));

       // String nutellaSayisi


    }
}
