package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
//  public static String fetchDataFromEXcelsheet(String sheet, int row ,int column) throws EncryptedDocumentException, IOException  {
//	String path="C:\\Users\\VIKRAM PAWAR\\OneDrive\\Desktop\\Class 5B.xlsx";
//	FileInputStream file= new FileInputStream(path);
//	
//	String data = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
//	System.out.println();
//	return data;
//}
public static File getScreenshot(WebDriver driver,int a) throws IOException {

	
	TakesScreenshot t=((TakesScreenshot)driver);
	File source= t.getScreenshotAs(OutputType.FILE);
	File dest= new File("test-output"+File.separator+"Snasphot"+File.separator+"photo"+a+".png");
	FileHandler.copy(source, dest);
	System.out.println("print");
	return dest;

	
}

}