import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class FileInputOutStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("Tops.txt");
		String s="This is File Input/Output File";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Writen SucessFully");

		FileInputStream fis=new FileInputStream("Tops.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}

}
