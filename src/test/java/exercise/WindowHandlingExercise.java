package exercise;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingExercise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window : "+parentWindow);
		
		WebElement openNewWindowBtn=driver.findElement(By.id("newWindowBtn"));
        openNewWindowBtn.click();
        
        Set<String>allChildWindows=driver.getWindowHandles();
        System.out.println(allChildWindows);
        
        Iterator<String>iterator=allChildWindows.iterator();
        while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				driver.manage().window().maximize();
				WebElement firstNameTxtBox=driver.findElement(By.xpath("//input[@id='firstName']"));
				firstNameTxtBox.sendKeys("Subina");
				WebElement secondNameTxtBox=driver.findElement(By.xpath("//input[@id='lastName']"));
				secondNameTxtBox.sendKeys("Subair");
				WebElement femaleAlertBtn=driver.findElement(By.id("femalerb"));
				femaleAlertBtn.click();
				WebElement languagesKnown=driver.findElement(By.id("englishchbx"));
				languagesKnown.click();
				WebElement emailTxtBox=driver.findElement(By.xpath("//input[@id='email']"));
				emailTxtBox.sendKeys("subina12@gmail.com");
				WebElement passwordTxtBox=driver.findElement(By.xpath("//input[@id='password']"));
				passwordTxtBox.sendKeys("qwe12#");
				WebElement registerBtn=driver.findElement(By.id("registerbtn"));
				registerBtn.click();
				WebElement messageTxt=driver.findElement(By.xpath("//label[@id='msg']"));
				System.out.println("message displayed : "+messageTxt.isDisplayed());
			
			}
        }
		driver.switchTo().window(parentWindow);
		driver.quit();

	}

}
