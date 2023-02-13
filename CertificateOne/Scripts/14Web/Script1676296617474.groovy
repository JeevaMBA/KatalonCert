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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.textbox)

WebUI.verifyElementPresent(findTestObject('Page_DEMOQA/Full Name'), 0)

WebUI.setText(findTestObject('Page_DEMOQA/Full Name'), 'some free text here goes')

WebUI.setText(findTestObject('Page_DEMOQA/Email'), 'email@email.co')

WebUI.setText(findTestObject('Page_DEMOQA/Current Address'), 'New address details hee go with full data')

WebUI.setText(findTestObject('Page_DEMOQA/Permanent Address'), 'Permanet addres details are given here with full details and street name of it.')

WebUI.waitForElementPresent(findTestObject('Page_DEMOQA/button_Submit'), 0)

WebUI.verifyElementClickable(findTestObject('Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Page_DEMOQA/button_Submit'))

WebUI.getWindowTitle()

WebUI.getWindowIndex()

WebUI.closeBrowser()

