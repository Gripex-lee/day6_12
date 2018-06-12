package day6_12;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J209 {
    public static void main(String[] args) {
        File inputFile=new File("D://test//fos.txt");
        File outputFile1=new File("D://test//fos_copy1.txt");
        File outputFile2=new File("D://test//fos_copy2.txt");
        //int
        try {
            //向文件中写入字节数组
        	FileInputStream fis = new FileInputStream(inputFile);  
            DataInputStream dis = new DataInputStream(fis);
            FileOutputStream fos = new FileOutputStream(outputFile1);
            String font;
            while((font=dis.readLine())!=null) {
            	fos.write(font.getBytes());
            	String b="\r\n";
            	fos.write(b.getBytes());
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //byte[]
        try {
            FileInputStream inputStream=new FileInputStream(inputFile);
            FileOutputStream outputStream=new FileOutputStream(outputFile2);
            byte n[]=new byte[10];  
            int result=inputStream.read(n);          
            while(result!=-1){
            	outputStream.write(n);          
            	result=inputStream.read(n);        
            }    
        } catch (Exception e) {     
        	e.printStackTrace();  
        }
    }
}
