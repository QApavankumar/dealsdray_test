
package browser_stack;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Link4_chrome {

		
	private static final String UserName = "pavan_3LDPbE";
	private static final String AccessKey = "Gq8n7cK1pUTxYRmrPznX";
	public static final String URL="https://" +UserName +":" + AccessKey +"@hub-cloud.browserstack.com/wd/hub";
	
public static void main(String[]args) throws IOException {	
	MutableCapabilities capabilities = new MutableCapabilities();
	capabilities.setCapability("browserName", "Chrome");
	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
	browserstackOptions.put("os", "Windows");
	browserstackOptions.put("osVersion", "11");
	browserstackOptions.put("browserVersion", "latest");
	browserstackOptions.put("local", "false");
	browserstackOptions.put("seleniumVersion", "3.14.0");
	capabilities.setCapability("bstack:options", browserstackOptions);


	WebDriver driver= new RemoteWebDriver(new URL(URL),capabilities);
	
	driver.get("https://www.getcalley.com/calley-teams-features/");
	
	
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\pavan\\Desktop\\screenshots\\pc\\chromelink4-12-sep.png"));
	driver.quit();
	
	
}

}
