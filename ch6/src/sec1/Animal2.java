package sec1;

public class Animal2 {

	public static void main(String[] args) {
		//Animal(이름,종류,다리,날개,척추,이동속도)
		Animal a = new Animal("치타","포유류",4,0,true,10);
		Animal b = new Animal("돼지","포유류",4,0,true);
		b.setSpeed(1000);
		Animal c = new Animal("바보");
		System.out.println("");
		
		c.data = 10; //data 필드가 디폴트이므로 가능
		a.running(a.getName(),a.getSpeed());
		b.running(b.getName(),b.getSpeed());
		c.running(c.getName(),c.getSpeed());
	}

}
