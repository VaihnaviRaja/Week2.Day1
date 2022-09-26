package Week2.Day1;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver drive1 = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//drive1.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//drive1.manage().window().maximize();
		driver.findElement(By.)
		
			
		
		
		

	}

}
