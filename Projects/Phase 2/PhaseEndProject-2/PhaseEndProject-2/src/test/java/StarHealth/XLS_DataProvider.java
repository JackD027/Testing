//package StarHealth;
//
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
//public class XLS_DataProvider {
//	
//	static Workbook book;
//	static Sheet sheet;
//   
//	public static String testdata_sheet_path = "C:\\Users\\Shubhendu Shekhar\\Desktop\\StarHealth.xlsx";
//	
//	public static Object[][] getTestData(String sheetName ) throws EncryptedDocumentException, IOException
//	{
//		
//		FileInputStream file = null;
//		file =	new FileInputStream(testdata_sheet_path);
//		
//		book = WorkbookFactory.create(file);
//		
//		sheet = book.getSheet(sheetName);
//		
//		Object[][] inputdata = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		
//		for(int i=0;i<sheet.getLastRowNum();i++)
//		{
//			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
//			{
//				inputdata[i][j] = sheet.getRow(i+1).getCell(j).toString();
//			}
//		}
//		
//		return inputdata;
//		
//	}
//
//}
//
package StarHealth;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLS_DataProvider {

    static Workbook book;
    static Sheet sheet;
    public static String testdata_sheet_path = "C:\\Users\\Shubhendu Shekhar\\Desktop\\StarHealth.xlsx";

    public static Object[][] getTestData(String sheetName) throws EncryptedDocumentException, IOException {
        FileInputStream file = null;
        try {
            file = new FileInputStream(testdata_sheet_path);
            book = WorkbookFactory.create(file);
            sheet = book.getSheet(sheetName);

            if (sheet == null) {
                throw new IllegalArgumentException("Sheet not found: " + sheetName);
            }

            int numRows = sheet.getPhysicalNumberOfRows();
            int numCols = sheet.getRow(0).getPhysicalNumberOfCells();

            Object[][] inputdata = new Object[numRows - 1][numCols]; // numRows - 1 to skip the header row

            for (int i = 1; i < numRows; i++) { // Start from 1 to skip the header row
                for (int j = 0; j < numCols; j++) {
                    if (sheet.getRow(i).getCell(j) != null) {
                        inputdata[i - 1][j] = sheet.getRow(i).getCell(j).toString();
                    } else {
                        // Handle the case when the cell is null or empty
                        inputdata[i - 1][j] = ""; // You can set it to an empty string or another default value
                    }
                }
            }

            return inputdata;
        } finally {
            if (file != null) {
                file.close();
            }
        }
    }
}
