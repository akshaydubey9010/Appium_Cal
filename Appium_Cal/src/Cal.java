import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;

// import io.appium.java_client.remote.MobileCapabilityType;


public class Cal {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","7.0");
		cap.setCapability("deviceName","Moto C Plus");
		cap.setCapability("udid","ZW2225CXC8");
		
		cap.setCapability("appPackage","com.google.android.calculator");
		cap.setCapability("appActivity","com.android.calculator2.Calculator");
	    
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),cap);
		Thread.sleep(2000);
		
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator("attribute(\"Value\")")).click();
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"1\"]")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//driver.activateApp("//android.widget.TextView[@content-desc=\"Settings\"]");
		
		driver.activateApp("com.android.settings");  //Package Name
		Thread.sleep(3000);
		
		//Scroll
		//driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\\\"\"+\"Display\"+\"\\\").instance(0))")).click();
	    
		/*
		// Click on Display
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Display\"]")).click();
		Thread.sleep(3000);
		
		
		//Click on Sleep
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sleep\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"com.android.settings:id/text1\" and @text=\"30 seconds\"]")).click();
		
		
		//driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"com.android.settings:id/text1\" and @text=\"30 seconds\"]")).click();
		
		//driver.startActivity(new Activity("<<PACKAGE-NAME>>", "<<ACTIVITY-NAME>>"));
		*/

		// WiFi Code - 
				
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Wi‑Fi\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}

	public static void SwitchONWiFi() {
		
		
		
		
	}
	
	
	
}
