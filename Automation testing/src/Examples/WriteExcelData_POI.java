package Examples;

import java.io.FileInputStream; //Read
import java.io.FileOutputStream;//Write
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcelData_POI {
	
	
	
public static void main(String args[]) throws Exception{
FileInputStream fileinput = new FileInputStream("E:\\Excel\\abc.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
XSSFSheet sheet = workbook.getSheet("sipu");
System.out.println(sheet.getSheetName());
System.out.println(sheet.getLastRowNum());
System.out.println("Before updating Cell Data "+sheet.getRow(2).getCell(1));
// Write the data to excel file
XSSFCell cell =  sheet.getRow(2).getCell(1);
cell.setCellValue("swagat");
fileinput.close();
FileOutputStream fileOut = new FileOutputStream("E:\\Excel\\abc.xlsx");
workbook.write(fileOut);
System.out.println("Updated data after write is done " + cell.getStringCellValue());
fileOut.close();

}
}