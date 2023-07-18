package WebDriverAPI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Argument;

public class WebDriverAPI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddip\\eclipse-workspace\\HashTag\\18JulyAssignment\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        String BaseURL = "https://www.hashtag-ca.com/careers/apply?jobCode=QAE001";
        driver.get(BaseURL);
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        
        // filling data in text fields
        
        Thread.sleep(300);
        WebElement name = driver.findElement(By.name("name"));
        name.click();
        name.sendKeys("Arpita");
        
        WebElement email = driver.findElement(By.name("email"));
        email.click();
        email.sendKeys("dasarpita0604@gmail.com");
        
        WebElement phone_field = driver.findElement(By.xpath("//input[@type='number']"));
        phone_field.sendKeys("9987467194");
        
        WebElement browse_file = driver.findElement(By.xpath("//input[@id='inputFile']"));
        browse_file.sendKeys("C:\\Users\\uddip\\Resume.docx");
        System.out.println("File uploaded successfully");
        
        WebElement description = driver.findElement(By.cssSelector("textarea[class='form-control hash-input']"));
      
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
      
        Thread.sleep(500);
        jse.executeScript("arguments[0].value='A test engineer with 5 years of professional experience';", description);
     
     
        WebElement Apply_button = driver.findElement(By.cssSelector("button[class='btn form-button font-12 font-bold']"));
        jse.executeScript("arguments[0].click();", Apply_button);
    
        
        Thread.sleep(5000);
        
        driver.quit();
        
	}

}
