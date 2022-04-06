package pack2;

import pack1.A;
//import pack.B;	B클래스는 접근제한자가 default이므로 다른 패키지 접근 X
class C {
	//A a = new A();
	
	//a.filed; - A클래스에 있는 filed는 접근 제한자가 protected이므로
	//같은 패키지이거나 상속 관계에서만 가능
}
