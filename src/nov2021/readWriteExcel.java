//  https://poi.apache.org/components/spreadsheet/quick-guide.html

package nov2021;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readWriteExcel {
	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\brlaw\\Documents\\Learn IT\\Simplilearn"+
	                            "\\Core Java\\HelloWorld\\Input data\\Family.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		List<List<String>> sheetcontent = new ArrayList<List<String>>();
		int cc = 0,rc = 0;
		while (rowIterator.hasNext())
		{ 
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			sheetcontent.add(new ArrayList<String>());
			while (cellIterator.hasNext())
			{
			 Cell cell = cellIterator.next();
			 sheetcontent.get(rc).add(cc,cell.getStringCellValue());
		     cc++;
			}
			 cc = 0;rc++;
		}
		wb.close();
		
		for(List<String> printSheetContents :  sheetcontent) {
			for(String printrow : printSheetContents) {
				System.out.print(printrow+" ".repeat(20-printrow.length()));
			}
			System.out.println();
		}
			
	}}
