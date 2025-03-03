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

WebUI.delay(1)

WebUI.click(findTestObject('Izin Page/Calendar Date'))

WebUI.delay(1)

WebUI.click(findTestObject('Izin Page/Pilih Tahun Button'))

WebUI.click(findTestObject('Izin Page/2025 Button'))

WebUI.click(findTestObject('Izin Page/Tanggal Sekarang Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Izin Page/Pilih Jam Button'))

WebUI.delay(2)

WebUI.dragAndDropToObject(findTestObject('Izin Page/Jam 8 Button'), findTestObject('Izin Page/Jam 8 Button'))

WebUI.delay(2)

WebUI.dragAndDropToObject(findTestObject('Izin Page/Menit 05 Button'), findTestObject('Izin Page/Menit 05 Button'))

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Izin Page/Keterangan Field'), 'Istri Melahirkan')

WebUI.click(findTestObject('Izin Page/Ajukan Button'))

WebUI.delay(3)

