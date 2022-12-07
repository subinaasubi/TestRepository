import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObsquraSiteEg {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		/*String url=driver.getCurrentUrl();
		System.out.println("current url is "+url);
		WebElement tableElement=driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		tableElement.click();
		WebElement newyork=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[6]//td[3]"));
		Boolean valueBoolean=newyork.isDisplayed();
		System.out.println(valueBoolean);*/
		
		WebElement inputForm=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		inputForm.click();
		WebElement messageBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageBox.sendKeys("hai");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	    Boolean message=yourMessage.isDisplayed();
	    System.out.println(message);
	    String textMessage=yourMessage.getText();
	    System.out.println(textMessage);
	    driver.close();
 }
}
