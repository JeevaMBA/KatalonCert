import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://uitestingplayground.com/visibility')

WebUI.verifyElementPresent(findTestObject('Page_Visibility/button_Display None'), 0)

WebUI.scrollToPosition(500, 100)

WebUI.verifyElementPresent(findTestObject('Page_Visibility/button_Offscreen'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Visibility/button_Visibility Hidden'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Visibility/button_Display None'), 0)

WebUI.verifyElementClickable(findTestObject('Page_Visibility/button_Overlapped'))

WebUI.verifyElementClickable(findTestObject('Page_Visibility/button_Offscreen'))

WebUI.click(findTestObject('Page_Visibility/button_Hide'))

WebUI.closeBrowser()

