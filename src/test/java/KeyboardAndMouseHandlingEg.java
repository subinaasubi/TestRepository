import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAndMouseHandlingEg {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
        Actions actions=new Actions(driver);
        WebElement inputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		//actions.contextClick(inputForm).build().perform();  //build and perform are used to compile and execute action class
		actions.doubleClick(inputForm).build().perform();
		
		WebElement messageBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("hai");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
        actions.sendKeys(showMessageButton,Keys.ENTER).build().perform();
        
        messageBox.clear();
        actions.keyDown(Keys.SHIFT).build().perform();
        messageBox.sendKeys("hello");
        actions.keyUp(Keys.SHIFT).build().perform();
        
        
	}

}
