import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadingEg1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		//chooseFile.click();
		chooseFile.sendKeys("C:\\Users\\user\\Desktop\\Selenium\\GroceryApp2.PNG");
		WebElement submitFileButton=driver.findElement(By.id("submitbutton"));
		submitFileButton.click();
		
		

	}

}
