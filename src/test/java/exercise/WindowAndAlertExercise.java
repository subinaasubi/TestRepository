package exercise;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowAndAlertExercise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String parentWindow=driver.getWindowHandle();
		WebElement openNewTabWindowBtn=driver.findElement(By.id("newTabBtn"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",openNewTabWindowBtn);
	    openNewTabWindowBtn.click();
	    
	    Set<String>allChildWindows=driver.getWindowHandles();
        System.out.println(allChildWindows);
        
        Iterator<String>iterator=allChildWindows.iterator();
        while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				driver.manage().window().maximize();
				System.out.println("Child Title :"+driver.getTitle());
				
				WebElement clickMeBtn=driver.findElement(By.id("alertBox"));
				clickMeBtn.click();
				 System.out.println(driver.switchTo().alert().getText());
				 driver.switchTo().alert().accept();
				
			}
        } 
        driver.switchTo().window(parentWindow);
        driver.quit();
	}

}
