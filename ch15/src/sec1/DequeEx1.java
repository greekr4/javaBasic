package sec1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.addFirst("kim");
		deque.addFirst("lee");
		deque.addLast("park");
		deque.addLast("kang");
		deque.add("gill");  //직전 명령의 위치에 추가
		System.out.println(deque);
		deque.offerLast("gl");	//큐처럼 가장 뒤에 추가
		deque.offerFirst("dd");	//큐처럼 가장 앞에 추가
		System.out.println(deque);
		deque.removeFirst();
		System.out.println(deque);
		deque.poll();
		System.out.println(deque);
		deque.pop();
		System.out.println(deque);
		//제거 : poll, remove, clear
		//출력 : peek
		//요소 값 가져오기 : getLast, getFirst
		
	
	}

}
