package interfaceex.shelf;

public interface Queue {
	
	void eQueue(String title); // 리스트의 맨 마지막에 추가
	
	String deQueue(); // 리스트의 맨 처음 항복 반환(0번 인덱스)
	
	int getSize(); // 현재 queue에 있는 개수 반환
}
