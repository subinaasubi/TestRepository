/*Q7. Get the size of the logo.*/
package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//img[@src='images/logo.png']"));
		Dimension logoSize=logo.getSize();
        System.out.println("Size of Logo : "+logoSize);  
	}

}
