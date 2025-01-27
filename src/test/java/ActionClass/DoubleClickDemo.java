package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://api.jquery.com/dblclick/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        Actions actions = new Actions(driver);

        actions.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();

        Thread.sleep(3000);

        System.out.println("Yeeee I double cliked the element !!! wowww !!!");
        driver.quit();
    }
}
