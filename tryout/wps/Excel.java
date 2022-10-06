package tryout.wps;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;

public class Excel {
    public static void main(String[] args) throws  Exception {
        //获取工作薄
        File file = new File("D:\\新建文件夹\\text.xls");
        Workbook wb = Workbook.getWorkbook(file);
        //获取sheet
        Sheet sheet = wb.getSheet("Sheet1");
        //循环获取单元格
        for (int i = 0; i < sheet.getRows(); i++) {
            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell=sheet.getCell(j,i);
                System.out.print(cell.getContents() + "\t");
            }
            System.out.println();
        }
        wb.close();
    }
    }
