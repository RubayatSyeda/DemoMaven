package DataFromExcel;

import ExcelUtility.ExcelFramework;

public class WriteFromExcel_UsingFramework {
    public static void main(String[] args) {

        ExcelFramework excel = new ExcelFramework();
        excel.loadExcel("C:\\Users\\rubay\\IdeaProjects\\DemoMaven\\src\\test\\java\\DataFromExcel\\TestData.xlsx\\TestData.xlsx");
        excel.writeData("Sheet1", 0, 2, "Status");
        excel.writeData("Sheet1", 1, 2, "Pass");
        excel.writeData("Sheet1", 2, 2, "Fail");

        excel.closeExcel();
    }
}

