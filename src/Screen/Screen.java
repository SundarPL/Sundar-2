package Screen;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Screen {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumFirstDay\\Driver\\chromedriver.exe");
		WebDriver webdriver=new ChromeDriver();
		webdriver.get("http://www.greenstechnologys.com/");
		webdriver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)webdriver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(s);
		File dest=new File("C:\\Users\\HP\\eclipse-workspace\\Screenshot\\output\\green.png");
		FileUtils.copyFile(s, dest);
		
		
		WebDr
		
}
}

