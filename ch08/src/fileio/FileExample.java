package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("c:/file/newfile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile()); // 파일확인
		System.out.println(file.isDirectory()); // 디렉터리 확인
		System.out.println(file.getName()); // 이름 확인
		System.out.println(file.getPath()); // 위치 확인
		System.out.println(file.length() + "B"); // 용량 확인
		
		
		//System.out.println("파일 생성");
		
	}

}
