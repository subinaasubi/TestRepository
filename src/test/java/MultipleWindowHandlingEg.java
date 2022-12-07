import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandlingEg {

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
				System.out.println("Child URL :"+driver.getCurrentUrl());
				
			}
		
		}
       driver.switchTo().window(parentWindow);
        System.out.println("Parent URL :"+driver.getCurrentUrl());
        System.out.println("Parent Title :"+driver.getTitle());
        
        driver.quit();
		
	}

}
