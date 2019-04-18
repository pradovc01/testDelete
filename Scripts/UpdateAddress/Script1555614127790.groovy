import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/homePage/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email address_email'), 'pradovc01@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_passwd'), '15vY55HfNEocmsnUm6x6eA==')

WebUI.click(findTestObject('Object Repository/LoginPage/span_Sign in'))

WebUI.click(findTestObject('Object Repository/AccountPage/span_My addresses'))

WebUI.click(findTestObject('Object Repository/AddressPage/span_Update'))

WebUI.setText(findTestObject('Object Repository/EditAddressPage/input__address1'), newAddress)

WebUI.click(findTestObject('Object Repository/EditAddressPage/span_Save'))
WebUI.waitForElementVisible(findTestObject('Object Repository/AddressPage/span_22222'), 5)

def actualAddrees= WebUI.getText(findTestObject('Object Repository/AddressPage/span_22222'));
KeywordLogger log = new KeywordLogger()
log.logInfo(actualAddrees)

assert (actualAddrees.equals(newAddress))

//WebUI.click(findTestObject('Object Repository/AddressPage/span_22222'))

WebUI.click(findTestObject('Object Repository/AddressPage/a_Sign out'))

WebUI.closeBrowser()

