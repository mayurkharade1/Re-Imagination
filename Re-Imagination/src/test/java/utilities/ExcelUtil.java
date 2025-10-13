package utilities;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtil {

    public static String[] getExcelRowData(int rowNumber) {
        String[] rowData = new String[3]; // Columns 2, 4, 6
        String filePath = "C:\\Users\\Lenovo\\eclipse-workspace\\Re-Imagination\\testdata\\LC_TestScenarios.xlsx";
        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(rowNumber - 1); // 0-based index

            if (row != null) {
                rowData[0] = getCellValue(row.getCell(1)); // Column 2 (B)
                rowData[1] = getCellValue(row.getCell(3)); // Column 4 (D)
                rowData[2] = getCellValue(row.getCell(5)); // Column 6 (F)
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rowData;
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) return "";

        switch (cell.getCellType()) {
            case STRING: return cell.getStringCellValue();
            case NUMERIC: return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN: return String.valueOf(cell.getBooleanCellValue());
            case FORMULA: return cell.getCellFormula();
            default: return "";
        }
    }
}
