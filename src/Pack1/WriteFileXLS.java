package Pack1;



import Pack2.XLS_Reader;

public class WriteFileXLS {
	
	public static void main(String[] args){
		
		XLS_Reader xls = new XLS_Reader("V:/WorkSpace/Day19VJ_ReadWriteXL/src/config/mytestdata.xlsx");
		
		//Writing data in the Cell
		//xls.setCellData(sheetName, colName, rowNum, data)
		
		xls.setCellData("writetestdata", "EmployeeName", 2, "Nickesh");
		xls.setCellData("writetestdata", "CompanyName", 2, "TheJavaCo");
		xls.setCellData("writetestdata", "Designation", 2, "Java Developer");
		
		
		xls.setCellData("writetestdata", "EmployeeName", 3, "Johnny");
		xls.setCellData("writetestdata", "CompanyName", 3, "TheSeleniumCo");
		xls.setCellData("writetestdata", "Designation", 3, "Web Developer");
		
		xls.setCellData("writetestdata", "EmployeeName", 4, "sureshkumar");
		
		
		
	}

}
