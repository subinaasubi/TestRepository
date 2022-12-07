//File Upload using RobortClass

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FileUploading2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement browseLink=driver.findElement(By.xpath("//*[text()='Browse']"));
		browseLink.click();
		Thread.sleep(3000);
		
		// creating object of Robot class
				Robot rb = new Robot();

				// Store the File path to the StringSelection class
				StringSelection filePath = new StringSelection("C:\\Users\\user\\Desktop\\Selenium\\GroceryApp2.PNG");

				//Copy above path to clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

				// press Contol+V for pasting
				rb.keyPress(KeyEvent.VK_CONTROL);
				Thread.sleep(4000);
				rb.keyPress(KeyEvent.VK_V);

				// release Contol+V for pasting
				rb.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(4000);
				rb.keyRelease(KeyEvent.VK_V);

				// for pressing and releasing Enter
				rb.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(4000);
				rb.keyRelease(KeyEvent.VK_ENTER);

				System.out.println("file uploaded..");

		

	}

}
