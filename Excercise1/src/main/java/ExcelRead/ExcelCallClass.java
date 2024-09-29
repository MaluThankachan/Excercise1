package ExcelRead;

import java.io.IOException;

public class ExcelCallClass {

	public static void main(String[] args) throws IOException
	{
		String s = ExcelMainClass.readFileExcel(0,0);
		System.out.println(s);
		Double d =  ExcelMainClass.readFileExcelInetger(0, 1);
		System.out.println(d);

		

	}

}
