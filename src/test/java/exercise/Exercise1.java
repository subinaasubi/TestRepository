package exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php\r\n");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println("Title : "+title+"\nUrl : "+url);
	}

}
