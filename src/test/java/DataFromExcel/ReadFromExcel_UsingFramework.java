package DataFromExcel;

import ExcelUtility.ExcelFramework;

public class ReadFromExcel_UsingFramework {
    public static void main(String[] args) {

        ExcelFramework excel = new ExcelFramework();
        excel.loadExcel("C:\\Users\\rubay\\IdeaProjects\\DemoMaven\\src\\test\\java\\DataFromExcel\\TestData.xlsx\\TestData.xlsx");
        System.out.println(excel.getData("Sheet1", 1, 0));
        System.out.println(excel.getData("Sheet1",1, 1));
        System.out.println(excel.getData("Sheet1", 2, 0));
        System.out.println(excel.getData("Sheet1",2, 1));
    }
    }


