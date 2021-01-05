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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.setText(findTestObject('bizzard/login/email_or_phone'), user_id)

WebUI.setText(findTestObject('bizzard/login/password'), password)

WebUI.click(findTestObject('bizzard/login/log_in_button'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementText(findTestObject('bizzard/dashboard/account_overview_header'), 'ACCOUNT OVERVIEW')

WebUI.closeBrowser()

TestData a = findTestData('New Test Data')

List<List<Object>> b = a.getAllData()

for (var1 in b) {
	for (var2 in var1) {
		print(var2)
	}
}

