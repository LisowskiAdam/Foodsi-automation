package com.example.foodsi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;

public class LoginActivity {
    WebDriver webDriver;

    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "AOSP on IA Emulator");
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
        capabilities.setCapability(CapabilityType.VERSION, "9");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "C:\\Users\\Lenovo\\AndroidStudioProjects\\Foodsi2\\app\\apk\\foodsi.apk");
        capabilities.setCapability("automationName", "UiAutomator2");

        webDriver = new RemoteWebDriver(new URL("http://0.0.0.0/wd/hub"), capabilities);
    }

    @Test
    public void loginActivity() throws InterruptedException, NumberFormatException {
        Thread.sleep(3000);
        webDriver.findElement(By.id("com.applover.foodsi:id/log_in_fragment_email")).sendKeys("examplemailtest@examplemailtestabcd.xyz");
        webDriver.findElement(By.id("com.applover.foodsi:id/log_in_fragment_password")).sendKeys("qwertyuiop");
        webDriver.findElement(By.id("com.applover.foodsi:id/log_in_button")).click();

        Thread.sleep(5000);
    }

    @AfterTest
    public void End() {
        webDriver.quit();
    }
}
