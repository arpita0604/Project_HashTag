package WebDriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uddip\\eclipse-workspace\\HashTag\\18JulyAssignment\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        String BaseURL = "https://www.hashtag-ca.com/careers/apply?jobCode=QAE001";
        driver.get(BaseURL);
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        //Checking Let's Speak button is working or not
        WebElement speak_button = driver.findElement(By.cssSelector("button[class='speak-btn btn-header-2 btn-white btn btn-outline-success my-2 my-sm-0']"));
        speak_button.click();
        
        
        Thread.sleep(3000);
        
        driver.quit();

	}

}
