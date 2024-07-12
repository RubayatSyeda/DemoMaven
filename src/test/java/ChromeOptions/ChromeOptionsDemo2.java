package ChromeOptions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class ChromeOptionsDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\rubay\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Create object of ChromeOptions class
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\rubay\\Desktop\\Tabby Cat 3.0.0.0.crx"));

        // Add chrome switch to run browser in headless mode
        options.addArguments("--headless");

        // Add chrome switch to disable sandbox
        options.addArguments("--no-sandbox");

        // Add chrome switch to overcome limited resource problems
        options.addArguments("--disable-dev-shm-usage");

        // Add chrome switch to set initial window size
        options.addArguments("--window-size=1024,768");

        // Add chrome switch to open browser in incognito mode
        options.addArguments("--incognito");

        // Add chrome switch to set proxy server
        // Remember to replace host:port with your actual proxy server details if you're using the --proxy-server option.
        options.addArguments("--proxy-server=host:port");

        // Add chrome switch to disable GPU
        options.addArguments("--disable-gpu");

        // Instantiate the chrome driver with options
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
    }
}
