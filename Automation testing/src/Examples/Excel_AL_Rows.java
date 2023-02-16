package Examples;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class Excel_AL_Rows {

	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("E:\\Excel\\EMP.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		int rowcount = st.getRows();
		System.out.println(rowcount);
		for (int i =0; i<rowcount; i++)
		{
		String Emp_id = st.getCell(0,i).getContents();
		String name = st.getCell(1,i).getContents();
		String email = st.getCell(2,i).getContents();
		String no = st.getCell(3,i).getContents();

		System.out.println(Emp_id +"||"+name+"||"+email+"||"+no );

	}

}
}