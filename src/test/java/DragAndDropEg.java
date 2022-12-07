import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropEg {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions actions=new Actions(driver);
		WebElement amntFiveThousand=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement amntDestination=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		actions.dragAndDrop(amntFiveThousand, amntDestination).build().perform();

	}

}
