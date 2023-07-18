package WebDriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddip\\eclipse-workspace\\HashTag\\18JulyAssignment\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        String BaseURL = "https://www.hashtag-ca.com/careers/apply?jobCode=QAE001";
        driver.get(BaseURL);
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
		// identify menu
        WebElement services_dropdown = driver.findElement(By.xpath("//a[@href='/services']"));
        Actions a = new Actions(driver);
        a.moveToElement(services_dropdown).perform();
        
        // identify sub-menu
        WebElement submenu = driver.findElement(By.xpath("//a[@href='/services/wordpress-development']"));
        a.moveToElement(submenu).click().perform();
        
        Thread.sleep(3000);
        
        driver.quit();
        

	}

}
