package sec1;
class Animal{
	String name;
}
class Dog extends Animal{}
class Cat extends Animal{}
public class ClassCastEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeType(dog);

	}
	public static void changeType(Animal animal) {
		try {
			Dog dog = (Dog) animal;
			Cat cat = (Cat) animal;
		} catch(ClassCastException e) {
			System.out.println("ClassCastException!!");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("알수 없는 오류");
			e.printStackTrace();
		}
		finally {
			System.out.println("END");
		}
		
	}
}
