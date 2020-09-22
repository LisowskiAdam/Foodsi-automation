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

public class RegisterAccount {
    WebDriver webDriver;

    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "AOSP on IA Emulator");
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
        capabilities.setCapability(CapabilityType.VERSION, "9");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", "C:\\Users\\Lenovo\\AndroidStudioProjects\\Foodsi2\\app\\apk\\foodsi.apk");
        capabilities.setCapability("automationName", "UIAutomator2");

        webDriver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test
    public void registerAccount() throws InterruptedException, NumberFormatException {
        Thread.sleep(3000);
        webDriver.findElement(By.id("com.applover.foodsi:id/new_account_button")).click();
        webDriver.findElement(By.id("com.applover.foodsi:id/new_account_fragment_full_name")).sendKeys("Adam");
        webDriver.findElement(By.id("com.applover.foodsi:id/new_account_fragment_email")).sendKeys("examplemailtest@examplemailtestabcd.xyz");
        webDriver.findElement(By.id("com.applover.foodsi:id/new_account_fragment_phone_number")).sendKeys("+48 282 656 941");
        webDriver.findElement(By.id("com.applover.foodsi:id/new_account_fragment_password")).sendKeys("qwertyuiop");
        webDriver.findElement(By.id("com.applover.foodsi:id/new_account_fragment_repeat_password")).sendKeys("qwertyuiop");
        webDriver.findElement(By.id("com.applover.foodsi:id/new_account_referral_code")).sendKeys("");
        webDriver.findElement(By.id("com.applover.foodsi:id/sign_up_fragment_button")).click();

        Thread.sleep(5000);
    }

    @AfterTest
    public void End() {
        webDriver.quit();
    }
}
