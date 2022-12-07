import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement iFrameJmeter=driver.findElement(By.id("a077aa5e"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",iFrameJmeter);
		
		driver.switchTo().frame(iFrameJmeter);
		WebElement iFrameImage=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		iFrameImage.click();
		driver.switchTo().parentFrame();  //to switch to parent
		//driver.switchTo().defaultContent();// also used to switch to parent.
		WebElement eMailTxtBox=driver.findElement(By.xpath("//input[@type='text']"));
		eMailTxtBox.sendKeys("subi123@gmail.com");
		
		
		
	}

}
