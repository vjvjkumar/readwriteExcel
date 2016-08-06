package Pack1;

import Pack2.XLS_Reader;

public class ReadFileXLS {
	
	public static void main(String[] args) {
		
		XLS_Reader xls = new XLS_Reader("V:/WorkSpace/testfile/mytestdata.xlsx");
		
		//Rows Count in mytestdata.xlsx file:
		System.out.println("Number of Rows: "+xls.getRowCount("testdata"));
		
		//Coloumns Count in mytestdata.xlsx file:
		System.out.println("Number of Coloumns: "+xls.getColumnCount("testdata"));
		
		
		
		
		for (int i=1; i<=xls.getRowCount("testdata"); i++){
			for (int j=0; j<=xls.getColumnCount("testdata"); j++){
		
		//Read data in the cell:
						// xls.getCellData(sheetName, colNum, rowNum)
		  
		   System.out.print(xls.getCellData("testdata", j, i)+ "  ");
		}
		
			System.out.println();	
				
	}
		
	}

}
