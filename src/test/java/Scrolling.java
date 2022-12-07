import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
       /* js.executeScript("window.scrollBy(0,1000)"); //for scroll down
        Thread.sleep(5000); //execution stops for 5 sec
        js.executeScript("window.scrollBy(0,-1000)"); //scroll up
        WebElement allCourseInclude=driver.findElement(By.xpath("//h2[contains(text(),'All Courses include')]"));
        js.executeScript("arguments[0].scrollIntoView();",allCourseInclude);
        System.out.println(allCourseInclude.getText()); */
        
        WebElement insuranceProject=driver.findElement(By.xpath("//a[text()='Insurance Project']"));
        js.executeScript("arguments[0].click();",insuranceProject);
        
        
        
	}

}
