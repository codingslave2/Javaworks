package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest1 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("data.txt");
		
		
		  int data; 
		  /*while(true) {
			  data = fr.read(); // 코드값으로 지정
			  if(data == -1) // 읽을 데이터가 없으면
				  break; // 빠져나옴
			  System.out.println((char)data);
		  }*/
		  
		  while((data = fr.read()) != -1) {
			  System.out.print((char)data);
		  }
		  
		  fr.close();
		
	}

}
