import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumPgm {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\BasicAutomation\\src\\main\\resources\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\user\\eclipse-workspace\\BasicAutomation\\src\\main\\resources\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		//driver.close();
	}

}
