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

import com.kms.katalon.core.testobject.ConditionType

import internal.GlobalVariable

public class FindingChildElements {

	private static final String dynamicIdPath = "//div[@id='top']/section"
	private static final String sectionsPath = 'employees-list-inner'
	private static final String nameSeletorPath='.name.u-link-color'
	private static final String titleSelectorPath='.title.u-text--small'

	public static TestObject getMyTestObject(String selectorType, String selectorValue){
		TestObject to = new TestObject()
		to.addProperty(selectorType, ConditionType.EQUALS, selectorValue)
		return to
	}

	@Keyword
	List<WebElement> getWebElementsAsList() {
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> elements = driver.findElements(By.className(sectionsPath))
		return elements
	}

	@Keyword
	List<WebElement> getWebElementsAsListByTag(WebElement elem) {
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> elements = elem.findElements(By.tagName("li"))
		return elements
	}

	@Keyword
	String getName(WebElement rootElem){
		WebDriver driver=DriverFactory.getWebDriver()
		WebElement name=rootElem.findElement(By.cssSelector(nameSeletorPath))
		return name.getText()
	}

	@Keyword
	String getTitle(WebElement rootElem){
		WebDriver driver=DriverFactory.getWebDriver()
		WebElement name=rootElem.findElement(By.cssSelector(titleSelectorPath))
		return name.getText()
	}
}
