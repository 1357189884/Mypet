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
        // ����ѧ��  
        ExportExcel<Student> ex = new ExportExcel<Student>();  
        String[] headers =  
        { "ѧ��", "����", "����", "�Ա�", "��������" };  
        List<Student> dataset = new ArrayList<Student>();  
        dataset.add(new Student(10000001, "����", 20, true, new Date()));  
        dataset.add(new Student(20000002, "����", 24, false, new Date()));  
        dataset.add(new Student(30000003, "����", 22, true, new Date()));  
        // ����ͼ��  
        try  
        {  
            OutputStream out = new FileOutputStream("D://a.xls");  
            ex.exportExcel(headers, dataset, out);  
            out.close();  
            JOptionPane.showMessageDialog(null, "�����ɹ�!");  
            System.out.println("excel�����ɹ���");  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}
