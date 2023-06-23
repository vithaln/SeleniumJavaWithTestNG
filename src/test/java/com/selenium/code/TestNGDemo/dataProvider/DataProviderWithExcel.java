package com.selenium.code.TestNGDemo.dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWithExcel {

	
	//set-up method will execute just before each test case run
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@AfterMethod
	public void stopBrowser() {
		driver.quit();
	}
	
	@Test(dataProvider = "searchDataProvider")
	//@Test
	public void searchKeywords(String keyword) {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(keyword);
		element.sendKeys(Keys.ENTER);
		
	}
	
	@DataProvider(name = "searchDataProvider")
	public Object[][] searchDataProvider(){
		
		String filename="C:\\Users\\Dell\\Downloads\\Book.xlsx";
		Object[][] obj=getDataFromExcel(filename,"Sheet1");
		/*
		 * obj[0][0]="Maharashtra Mumbai"; obj[1][0]="Karanatak Bengaluru";
		 */
		System.out.println("DATA Object "+obj);
		return obj;
	}
	
	//@DataProvider
	public String[][] getDataFromExcel(String filename,String sheetname) {
		
		String[][] data=null;
	
	//	FileInputStream fileInputStream=null;
		
		try {
			FileInputStream fileInputStream=new FileInputStream(filename);
		
	//	XSSFWorkbook workbook=null;
	
		XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
	
		
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		int ttlRows = sheet.getLastRowNum();
		System.out.println("Total rows=> "+ttlRows);
		int ttlCells = sheet.getRow(0).getLastCellNum();
		System.out.println("Total cells=> "+ttlCells);

		
		//intilize array 
		data=new String[ttlRows][ttlCells];
		
		
		for(int currentRow=0;currentRow<ttlRows;currentRow++) {
			
			for(int currentCell=0;currentCell<ttlCells;currentCell++) {
				
		data[currentRow][currentCell]=sheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
			}
			//System.out.print("\t");
		}
		workbook.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		//System.out.println();
		System.out.println("DATA=> "+data.toString());
		
		return data;
	
	}
	
	
}
