package sec1;

import java.util.Stack;
// LIFO 구조 --> Stack
// push (값추가) , pop (값제거)
public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		stack1.push(20);
		stack1.push(50);
		stack1.push(30);
		System.out.println("스택의 크기 : "+stack1.size());
		System.out.println("스택 값 20이 있나요? : "+stack1.contains(20));
		System.out.println("스택에 비어 있는 저장소가 있는지 ? : "+stack1.empty());
		System.out.println("스택의 마지막 값 : "+stack1.peek());
		stack1.pop(); //마지막 값 삭제
		System.out.println("스택의 크기 : "+stack1.size());
		System.out.println("스택의 마지막 값 : "+stack1.peek());
		stack1.clear(); 
		System.out.println("스택의 크기 : "+stack1.size());
		//System.out.println(stack1.elementAt(1));
		


	}

}
