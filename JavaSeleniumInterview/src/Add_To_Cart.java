import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;

public class Add_To_Cart {
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

        WebElement addProduct = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addProduct.click();

        WebElement cart = driver.findElement(By.id("shopping_cart_container"));
        cart.click();
        System.out.println("Add item to cart successfully");
        
        driver.quit();
    }
}
