package browser_stack;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.common.io.Files;

public class Prexo_test {

	

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
ChromeOptions option=new ChromeOptions();
option.addArguments("--remote-allow-origins=*");
WebDriver driver =new ChromeDriver(option);


	
	driver.get("https://demo.dealsdray.com/");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	
	
	driver.manage().window().fullscreen();
	
	
	
	Thread.sleep(5000);
	
Robot r= new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-vwfva9']")).click();
	
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputSizeSmall css-1imb3v5']")).sendKeys("C:\\Users\\pavan\\Desktop\\uploadfile\\demo-data (1).xlsx");
Thread.sleep(2000);	
	
driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")).click();
Thread.sleep(2000);



driver.findElement(By.xpath("//button[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root  css-6aomwy']")).click();
Thread.sleep(2000);
	Alert alert =driver.switchTo().alert();
	
	alert.accept();
	driver.manage().window().fullscreen();	
	
	
	Thread.sleep(2000);
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\pavan\\Desktop\\screenshots\\pc\\prexo-8-sep.png"));
	driver.quit();

	
	
	
	
	
	
	
}

}






















