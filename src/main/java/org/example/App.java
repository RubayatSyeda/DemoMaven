package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //Old way of doing things.
       //System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("https://chatgpt.com/?oai-dm=1");
        driver.get("https://www.facebook.com/");



//method chaining
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
