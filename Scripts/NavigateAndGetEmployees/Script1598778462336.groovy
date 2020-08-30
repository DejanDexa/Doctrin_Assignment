import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


WebUI.openBrowser('https://doctrin.se/')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

//Dismiss cookies
WebUI.click(findTestObject('Object Repository/Page_Digitalisera vrden - Doctrin/button_Jag frstr'))

WebUI.click(findTestObject('Page_Digitalisera vrden - Doctrin/a_Jobba hos oss'))

WebUI.switchToWindowTitle('Doctrin - Join Doctrin\'s mission')
WebUI.comment('User has successfully navigated to careers page')

//Dismiss cookies
WebUI.click(findTestObject('Page_Doctrin - Join Doctrins mission/button_Got it'))

WebUI.click(findTestObject('Object Repository/Page_Doctrin - Join Doctrins mission/a_More coworkers'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://career.doctrin.se/people')

List<WebElement> teams = CustomKeywords.'com.doctrin.FindingChildElements.getWebElementsAsList'()

for (int i = 0; i < teams.size(); i++) {
    List<WebElement> employeesInTeams = CustomKeywords.'com.doctrin.FindingChildElements.getWebElementsAsListByTag'(teams[
        i])

    for (int j = 0; j < employeesInTeams.size(); j++) {
        String title = CustomKeywords.'com.doctrin.FindingChildElements.getTitle'(employeesInTeams[j])

        if (title.contains('Engineer') || title.contains('Project')) {
            String name = CustomKeywords.'com.doctrin.FindingChildElements.getName'(employeesInTeams[j])

            CustomKeywords.'com.doctrin.WriteToFile.WriteParamToFile'(name, title)
        }
    }
}

