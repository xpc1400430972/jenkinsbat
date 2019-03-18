package openbaidu;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class openbaidu {
@Test
	public void caozuo() throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");//C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com";
		driver.get(url);
	}
}
