
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

public class Link5_safari {

		
	private static final String UserName = "pavan_3LDPbE";
	private static final String AccessKey = "Gq8n7cK1pUTxYRmrPznX";
	public static final String URL="https://" +UserName +":" + AccessKey +"@hub-cloud.browserstack.com/wd/hub";
	
public static void main(String[]args) throws IOException {	
	
	MutableCapabilities capabilities = new MutableCapabilities();
	capabilities.setCapability("browserName", "Safari");
	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
	browserstackOptions.put("os", "OS X");
	browserstackOptions.put("osVersion", "Sonoma");
	browserstackOptions.put("browserVersion", "17.3");
	browserstackOptions.put("local", "false");
	browserstackOptions.put("seleniumVersion", "3.14.0");
	capabilities.setCapability("bstack:options", browserstackOptions);



	WebDriver driver= new RemoteWebDriver(new URL(URL),capabilities);
	
	driver.get("https://www.getcalley.com/calley-pro-features/");
	
	
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\pavan\\Desktop\\screenshots\\pc\\safarilink5-12-sep.png"));
	driver.quit();
	
	
}

}
