/* Q6. Get the tagname, attribute, class, and CSS value of the Home tab.*/

package exercise;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise6 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement homeTab=driver.findElement(By.xpath("//a[text()='Home']"));
		String tagName=homeTab.getTagName();
		System.out.println("TagName : "+tagName);
		String attribute=homeTab.getAttribute("href");
		System.out.println("Attribute href: "+attribute);
		/*Class<? extends WebElement> classAttribute=homeTab.getClass();
		System.out.println("Class :"+classAttribute);*/
		String cssValue=homeTab.getCssValue("display");
		System.out.println("CSS value: "+cssValue);
	}
}
