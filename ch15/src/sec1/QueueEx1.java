package sec1;

import java.util.LinkedList;
import java.util.Queue;
//FIFO 구조 : Queue(가장 처음 값이 가장 처음 출력되거나 제거됨)
//offer (값추가), poll (값제거)
public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(20);
		que.add(50);
		que.offer(30);
		que.offer(40);
		System.out.println(que.peek());
		System.out.println(que.size());
		que.remove(); //처음 제거 (20)
		System.out.println(que.peek());
		System.out.println(que.size());
		que.poll(); //마지막 제거 (40)
		System.out.println(que.size());
		que.clear();
		System.out.println(que.size());
	}

}
