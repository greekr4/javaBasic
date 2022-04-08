package sec1;
class Car {
	public int num;
	Car(int num){
		this.num = num;
	}
	
}

class Employee implements Cloneable {
	public int no;
	public String name;
	public Car car;
	public Employee(int no, String name, Car car) {
		this.no = no;
		this.name = name;
		this.car = car;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();	//얕은 복제 - no, name만 복제
		//cloned.car = new Car(this.car.name);		//깊은 복제 - 객체의 필드를 별도로 복제해줘야 함
		return cloned;
	}
	@Override
	public String toString() {
		return no+" : "+name;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"인 사원의 객체를 제거한다.");
		super.finalize();
	}
}

public class CloneEx1 {

	public static void main(String[] args) {
		Car car = new Car(1234);
		Employee a = new Employee(1, "김기태", car);
		System.out.println(a.toString());
				
		a = null;
		System.gc();
		//System.out.println(a.toString());
		
		
		
		
	}

}
