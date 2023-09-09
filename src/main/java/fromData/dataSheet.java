package fromData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataSheet {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static String cellData1;


    public dataSheet(String excelPath1, String excelSheet1) {

        try {
            workbook = new XSSFWorkbook(excelPath1);
            sheet = workbook.getSheet(excelSheet1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static String getCellData1(int rowNum1, int colNum1 ) {

        try {
            cellData1 = sheet.getRow(rowNum1).getCell(colNum1).getStringCellValue();
        }catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

        return cellData1;
    }
}
