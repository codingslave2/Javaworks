package fileio.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("data.txt");
		
		fw.write("Hello~\n");
		fw.write("ㅎㅇ\n");
		fw.write(1); // 정수는 아스키 코드값으로 인식
		fw.write(1+1);
		//fw.write(1.25); //실수 사용 불가
		
		char[] buf = {'s', 'm', 'i', 'l', 'e'};
		fw.write(buf);
		fw.write(10); // 줄바꿈 (개행 문자)
		fw.write(buf, 1, 4); // 1번 인덱스부터 4개 출력
		
		fw.close();
		
		System.out.println("수행완료");
		
	}

}
