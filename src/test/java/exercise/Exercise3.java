/*Q3. Navigate to Input form page. Click on Radio buttons demo.  Select
 gender as female, click on Show selected value,then print the getting
  message. And also very the female radio button is selected or not.*/


package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement inputform=driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
	    inputform.click();
	    WebElement radioButtonDemo=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	    radioButtonDemo.click();
	    WebElement femaleRadioButton=driver.findElement(By.xpath("(//label[text()='Female'])[1]"));
	    femaleRadioButton.click();
	    Boolean radioButtonSelected=femaleRadioButton.isEnabled();
	    System.out.println("Female Radio Button is selected : "+radioButtonSelected);
	    WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
	    showSelectedValue.click();
	    WebElement mesageDisplayed=driver.findElement(By.xpath("//div[@id='message-one']"));
	   String message=mesageDisplayed.getText();
	   System.out.println(message);
	}

}
