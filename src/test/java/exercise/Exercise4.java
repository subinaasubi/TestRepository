/*Q4. Navigate to Table page. Print the all details of the person "Tiger Nixon" in the console.*/

package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement tablePage=driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		tablePage.click();
		WebElement tigerNixon=driver.findElement(By.xpath("(//table[@id='dtBasicExample']//tr[@class='odd'])"));
		String detail=tigerNixon.getText();
        System.out.println(detail);
	}

}
