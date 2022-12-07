import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement colourDropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		colourDropDown.click();
		Select select=new Select(colourDropDown);
		//select.selectByIndex(2);
		//select.selectByValue("Green");
		select.selectByVisibleText("Red");
		
		String selectedValue=select.getFirstSelectedOption().getText();// getting the currently selected option
		System.out.println(selectedValue);
		
         boolean b2=select.isMultiple();
         System.out.println(b2);  //checking whether it is multiselected dropdown or not
         
		//	select.deselectByVisibleText("Green");

		List<WebElement>listOfElements=select.getOptions(); // getting all selected options
		int size=listOfElements.size();
		for(int i=0;i<size;i++) {
			String option=listOfElements.get(i).getText();
			System.out.println(option); //getting all values inside dropdown
		}

		WebElement dropdown_2 = driver.findElement(By.id("multi-select-field"));
		Select j = new Select(dropdown_2);
		j.selectByIndex(1);
		j.selectByIndex(2);

		//		j.deselectByIndex(1);
		 //      j.deselectByIndex(2);
		
		// j.deselectAll();
		
		
	   List<WebElement>  list=j.getAllSelectedOptions();
		int size2=list.size();
		for(int j2=0;j2<size2;j2++) {
			String option2=listOfElements.get(j2).getText();
			System.out.println(option2);
		}
		
		boolean b=j.isMultiple();
		System.out.println(b);
	}

}
