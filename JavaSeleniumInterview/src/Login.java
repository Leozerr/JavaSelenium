import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;

public class Login {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/patchanon/Documents/GitHub/JavaSelenium/JavaSeleniumInterview/chromedriver");

        WebDriver driver= new ChromeDriver();

        String Url = "https://www.saucedemo.com/";					
        driver.get(Url);					
	
        WebElement email = driver.findElement(By.id("user-name"));							
        WebElement password = driver.findElement(By.name("password"));							

        email.sendKeys("standard_user");					
        password.sendKeys("secret_sauce");						

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        System.out.println("Login successfully");
        
        driver.quit();
    }
}
