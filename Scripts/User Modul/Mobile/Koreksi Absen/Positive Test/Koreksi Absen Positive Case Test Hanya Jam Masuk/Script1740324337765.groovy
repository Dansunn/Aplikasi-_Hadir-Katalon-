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

WebUI.delay(2)

String initialText = WebUI.getText(findTestObject('Object Repository/Koreksi Absen Page/txtTotal')).trim()

println('Teks sebelum pengajuan: ' + initialText)

int initialValue = Integer.parseInt(initialText.replaceAll('[^0-9]', ''))

println('Nilai sebelum pengajuan: ' + initialValue)

WebUI.delay(2)

WebUI.click(findTestObject('Koreksi Absen Page/Ajukan Koreksi Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Koreksi Absen Page/Tombol Jam Masuk'))

WebUI.delay(1)

WebUI.click(findTestObject('Koreksi Absen Page/Tombol Pilih Tahun Jam Masuk'))

WebUI.click(findTestObject('Koreksi Absen Page/Tahun 2024 Button'))

WebUI.click(findTestObject('Koreksi Absen Page/Tombol Next Bulan'))

WebUI.click(findTestObject('Koreksi Absen Page/Button Tgl 19 Feb'))

WebUI.delay(1)

WebUI.dragAndDropToObject(findTestObject('Koreksi Absen Page/Jam 7 Button'), findTestObject('Koreksi Absen Page/Jam 7 Button'))

WebUI.delay(2)

WebUI.dragAndDropToObject(findTestObject('Koreksi Absen Page/Menit 15 Button'), findTestObject('Koreksi Absen Page/Menit 15 Button'))

WebUI.delay(1)

WebUI.click(findTestObject('Koreksi Absen Page/Ajukan Button'))

String updatedText = WebUI.getText(findTestObject('Object Repository/Koreksi Absen Page/txtTotal')).trim()

println('Teks setelah pengajuan: ' + updatedText)

int updatedValue = Integer.parseInt(updatedText.replaceAll('[^0-9]', ''))

println('Nilai setelah pengajuan: ' + updatedValue)

WebUI.verifyEqual(updatedValue, initialValue + 1)

WebUI.delay(2)

