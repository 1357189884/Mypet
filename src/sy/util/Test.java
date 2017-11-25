package sy.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args)  
    {  
        // 测试学生  
        ExportExcel<Student> ex = new ExportExcel<Student>();  
        String[] headers =  
        { "学号", "姓名", "年龄", "性别", "出生日期" };  
        List<Student> dataset = new ArrayList<Student>();  
        dataset.add(new Student(10000001, "张三", 20, true, new Date()));  
        dataset.add(new Student(20000002, "李四", 24, false, new Date()));  
        dataset.add(new Student(30000003, "王五", 22, true, new Date()));  
        // 测试图书  
        try  
        {  
            OutputStream out = new FileOutputStream("D://a.xls");  
            ex.exportExcel(headers, dataset, out);  
            out.close();  
            JOptionPane.showMessageDialog(null, "导出成功!");  
            System.out.println("excel导出成功！");  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
