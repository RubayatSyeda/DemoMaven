package LocatorsExperiment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExmaple1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rubay\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //1-> id

        WebElement uname =driver.findElement(By.id("user-name"));
        uname.sendKeys("standard_user");
        //2-> name
       // By pass =By.name("txtPassword);
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //3-> className can be used many times,so it wont be unique
        driver.findElement(By.className("submit-button")).click();
        //4-> Xpath
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_Container\"]/a")).click();
        //5-> css
        driver.findElement(By.cssSelector("#checkout")).click();


    }

}

