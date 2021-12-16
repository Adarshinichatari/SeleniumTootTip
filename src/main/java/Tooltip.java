import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip{
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/tooltip.html");
        Actions n = new Actions(driver);
        n.moveToElement(driver.findElement(By.id("age"))).build().perform();
        System.out.println(driver.findElement(By.className("ui-helper-hidden-accessible")).getText());
        driver.quit();

    }
}