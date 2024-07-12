package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;




public class FileUploadDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rubay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\rubay\\Desktop\\Document\\Police Clearence Amma.pdf");
        driver.findElement(By.xpath("//input[@name='resumeupload']")).click();

        try {
            Runtime.getRuntime().exec("C:\\Users\\rubay\\Desktop\\Ammas File.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}