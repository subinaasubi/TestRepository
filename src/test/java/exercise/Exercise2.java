/*Q2. Navigate to Input form page. Click on Checkbook demo. 
Select the Check box one and Check box three.
Verify them selected or not.*/

package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://selenium.obsqurazone.com/index.php");
        driver.manage().window().maximize();
        WebElement inputform=driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
        inputform.click();
        WebElement checkBoxDemo=driver.findElement(By.xpath("//a[contains(text(),'Checkbox')]"));
        checkBoxDemo.click();
        WebElement checkBox1=driver.findElement(By.xpath("//label[@class='form-check-label' and @for='check-box-one']"));
        checkBox1.click();
        WebElement checkBox3=driver.findElement(By.xpath("//label[@class='form-check-label' and @for='check-box-three']"));
        checkBox3.click();
        Boolean selected1=checkBox1.isEnabled();
        Boolean selected3=checkBox3.isEnabled();
        System.out.println("CheckBox 1 is selected : "+selected1+"\nCheckBox 3 is selected : "+selected3);
	}

}
