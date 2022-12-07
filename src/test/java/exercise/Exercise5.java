/*Q5. Navigate to Table page. Click on Table sort and search. 
 Search name as "Dai Rios" in the search box. 
 Then very the searched name is display or not. */
package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement tablePage=driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		tablePage.click();
		WebElement tableSortAndSearch=driver.findElement(By.xpath("//a[text()='Table Sort And Search']"));
		tableSortAndSearch.click();
		WebElement searchBox=driver.findElement(By.xpath("//input[@type='search']"));
		searchBox.sendKeys("Dai Rios");
		WebElement displayedResult=driver.findElement(By.xpath("(//table[@id='example']//td[@class='sorting_1'])"));
		String nameDisplayed=displayedResult.getText();
		//System.out.println(nameDisplayed);
		Boolean searchResult=nameDisplayed.equalsIgnoreCase("Dai Rios");
		System.out.println("searched name is displayed :"+searchResult);
	}
} 
