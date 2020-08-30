package com.doctrin


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.firefox.internal.ProfilesIni
import com.kms.katalon.core.webui.driver.WebUIDriverType
import internal.GlobalVariable as GlobalVariable

public class startBrowserWithProfile {

	//@Keyword
	//def void startBrowser() {
		//WebUI.openBrowser 4(’’)
		//WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()
		//switch(executedBrowser) {
			//case WebUIDriverType.FIREFOX_DRIVER: // “Firefox”
				//ProfilesIni profile = new ProfilesIni();
				//FirefoxProfile FF = profile.getProfile(GlobalVariable.G_FFProfile);
				//FirefoxOptions options = new FirefoxOptions().setProfile(FF);
				//System.setProperty('webdriver.gecko.driver', DriverFactory.getGeckoDriverPath())
				//WebDriver driver = new FirefoxDriver(options);
			// let Katalon Studio to use the WebDriver created here
				//DriverFactory.changeWebDriver(driver)
				//break
		//}
	//}
}