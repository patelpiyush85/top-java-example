import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("Tops1.txt");
		String s="This file is Input/Output operation in java";
		fw.write(s);
		fw.flush();
		fw.close();
		
		
		FileReader fr=new FileReader("Tops1.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
		

	}

}
