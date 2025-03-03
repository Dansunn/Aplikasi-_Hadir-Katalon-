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

WebUI.delay(4)

WebUI.click(findTestObject('Izin Page/Calendar Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Izin Page/Pilih Tahun Button Izin Off'))

WebUI.click(findTestObject('Izin Page/2025 Button'))

WebUI.click(findTestObject('Izin Page/Tanggal Sekarang Button'))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Izin Page/Keterangan Alasan Off Field'), 'Urusan Keluarga')

WebUI.click(findTestObject('Izin Page/Ajukan Button'))

WebUI.verifyElementText(findTestObject('Izin Page/AlertPermintaan dalam proses'), 'Permintaan dalam proses')

WebUI.delay(3)

WebUI.closeBrowser()

