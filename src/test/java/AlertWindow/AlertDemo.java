package AlertWindow;

    import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class AlertDemo {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",  "C:\\Users\\rubay\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://demo.automationtesting.in/Alerts.html");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
            Thread.sleep(2000);

            Alert alertElement = driver.switchTo().alert();

            //Getting the alert message:
            System.out.println(driver.switchTo().alert().getText());

            alertElement.accept();

            //Using method chaining:
            // driver.switchTo().alert().accept();
            driver.quit();


        }
    }

