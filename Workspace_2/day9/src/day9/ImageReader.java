package day9;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageReader{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
		
   FileInputStream in= new FileInputStream("E:\\testimage.jpg");
   FileOutputStream o = new FileOutputStream("E:\\new.jpg");
   BufferedInputStream B=new BufferedInputStream(in);
   BufferedOutputStream Bo= new BufferedOutputStream(o);
   
   int a =0;
   while(a!=-1) {
	   a=B.read();
	   Bo.write(a);
   }
   B.close();
   Bo.close();
		}
		 catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
