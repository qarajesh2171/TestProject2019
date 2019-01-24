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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://greendesk.in/contact_us')

not_run: WebUI.click(findTestObject('Page_GreenDesk/img_items in MyBasket'))

not_run: WebUI.click(findTestObject('Page_GreenDesk/a_CONTACT US'))

WebUI.setText(findTestObject('Page_GreenDesk/input_Get in Touch_name'), Fullname)

WebUI.setText(findTestObject('Page_GreenDesk/input_Get in Touch_pname'), Subject)

WebUI.setText(findTestObject('Page_GreenDesk/input_Get in Touch_phone'), Contact)

WebUI.setText(findTestObject('Page_GreenDesk/input_Get in Touch_email'), Email)

WebUI.setText(findTestObject('Page_GreenDesk/textarea_Get in Touch_message'), Message)

WebUI.click(findTestObject('Page_GreenDesk/input_Get in Touch_btn btn-pri'))

WebUI.closeBrowser()

